/**
 * https://programmers.co.kr/learn/courses/30/lessons/87390
 * n^2 배열 자르기
 * 배열로 만들어서 자르기=>실패(런타임에러)
 *
 */

function solution(n, left, right) {
  let answer = [];

  for (let i = left; i <= right; i++) {
    answer.push(Math.floor(Math.max(i / n, i % n)) + 1);
  }

  return answer;
}

console.log(solution(3, 2, 5)); //[3,2,2,3]
console.log(solution(4, 7, 14)); //[4,3,3,3,4,4,4,4]
