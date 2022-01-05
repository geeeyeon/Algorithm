/**
 * https://programmers.co.kr/learn/courses/30/lessons/76502
 * 괄호 회전하기
 */

function solution(s) {
  let answer = 0;
  if (s.length % 2 !== 0) return answer;
  let sLen = s.length;

  while (sLen > 0) {
    s = s.substr(1) + s.charAt(0);
    if (isMatch(s)) {
      answer++;
    }
    sLen--;
  }

  return answer;
}

function isMatch(s) {
  let check = [];

  for (let i = 0; i < s.length; i++) {
    if (s.charAt(i) === "(" || s.charAt(i) === "{" || s.charAt(i) === "[")
      check.push(s.charAt(i));
    else if (
      (s.charAt(i) === ")" && check[check.length - 1] === "(") ||
      (s.charAt(i) === "}" && check[check.length - 1] === "{") ||
      (s.charAt(i) === "]" && check[check.length - 1] === "[")
    ) {
      if (check.length === 0) return false;
      else check.pop();
    }
  }
  return check.length === 0 ? true : false;
}

console.log(solution("[](){}")); //3
console.log(solution("}]()[{")); //2
console.log(solution("[)(]")); //0
console.log(solution("}}}")); //0
