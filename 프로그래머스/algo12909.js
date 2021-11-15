/**
 * https://programmers.co.kr/learn/courses/30/lessons/12909
 * 올바른 괄호
 *
 * 배열 비우는 방법
 * array.pop();
 * array.length=0;
 * array=[];
 * array.splice(startIndex, deleteCount)
 * array.slice(startIndex, endIndex)
 */

function solution(s) {
  let check = [];

  for (let i = 0; i < s.length; i++) {
    if (s.charAt(i) === "(") check.push("(");
    else if (s.charAt(i) === ")") {
      if (check.length === 0) return false;
      else check.pop();
    }
  }
  return check.length === 0 ? true : false;
}

console.log("--->", solution(")()("));
