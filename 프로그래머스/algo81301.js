/**
 * https://programmers.co.kr/learn/courses/30/lessons/81301
 * 숫자 문자열과 영단어
 */

function solution(s) {
  let num = [
    "zero",
    "one",
    "two",
    "three",
    "four",
    "five",
    "six",
    "seven",
    "eight",
    "nine",
  ];

  for (let i = 0; i < 10; i++) {
    let tmp = s.split(num[i]);
    s = tmp.join(i);
  }

  return Number(s);
}
