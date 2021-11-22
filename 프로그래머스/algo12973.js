/**
 * https://programmers.co.kr/learn/courses/30/lessons/12973
 * 짝지어 제거하기
 *
 * 문자열을 배열에 넣은 후에 비교 => 시간초과
 * 스택이용 넣으면서 비교 및 빼기
 */

function solution(s) {
  let tmp = [];
  for (let i = 0; i < s.length; i++) {
    tmp.push(s.charAt(i));
    if (tmp[tmp.length - 1] === tmp[tmp.length - 2]) {
      tmp.pop();
      tmp.pop();
    }
  }
  return tmp.length === 0 ? 1 : 0;
}

console.log("--->", solution("baabaa"));
