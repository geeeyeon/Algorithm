/**
 * https://programmers.co.kr/learn/courses/30/lessons/12934
 * 정수 제곱근 판별
 *
 * n의 루트값 : Math.sqrt(n)
 * n의 m승 값 : Math.pow(n,m)
 */

function solution(n) {
  if (Math.sqrt(n) % 1 !== 0) {
    return -1;
  } else {
    return Math.pow(Math.sqrt(n) + 1, 2);
  }
}
console.log("--->", solution(121));
