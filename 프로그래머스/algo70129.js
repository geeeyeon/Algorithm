/**
 * https://programmers.co.kr/learn/courses/30/lessons/70129
 * 이진 변환 반복하기
 */

function solution(s) {
  let turn = 0;
  let removeZero = 0;
  let rmZero = /0/g;
  while (s !== "1") {
    let sLength = s.length; //s길이
    let removed = s.replace(rmZero, "").length; //0제거 s
    removeZero += sLength - removed;
    s = Number(removed).toString(2);
    turn++;
  }
  return [turn, removeZero];
}

console.log("--->", solution("110010101001")); //[3,8]
console.log("--->", solution("01110")); //[3,3]
console.log("--->", solution("1111111")); //[4,1]
