/**
 * https://programmers.co.kr/learn/courses/13213/lessons/91074
 * Ch05-2. 스택_올바른 괄호 실습
 */

function solution(s) {
  let tmp = [];

  for (let i = 0; i < s.length; i++) {
    if (s.charAt(i) === "(") tmp.push(s.charAt(i));
    else if (tmp[tmp.length - 1] === "(" && s.charAt(i) === ")") {
      tmp.pop();
    } else {
      return false;
    }
  }
  return tmp.length > 0 ? false : true;
}

console.log("--->", solution("()()")); //true
console.log("--->", solution("(())()")); //true
console.log("--->", solution(")()(")); //false
console.log("--->", solution("(()(")); //false
