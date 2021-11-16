/**
 * https://programmers.co.kr/learn/courses/30/lessons/12951
 * JadenCase 문자열 만들기
 *
 * string.slice(startIndex, [endIndex]) // startIndex부터 자르기
 */

function solution(s) {
  let tmp = s.toLowerCase().split(" ");
  for (let i = 0; i < tmp.length; i++) {
    let str = tmp[i];
    tmp[i] = tmp[i].charAt(0).toUpperCase() + str.slice(1);
  }

  return tmp.join(" ");
}
console.log("--->", solution("3people unFollowed me"));
