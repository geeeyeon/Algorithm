/**
 * https://programmers.co.kr/learn/courses/30/lessons/12982
 * 예산
 *
 * 배열 오름차순정렬
 * d.sort((a, b) => a - b);
 */
function solution(d, budget) {
  d = d.sort((a, b) => a - b);
  let answer = 0;
  let sum = 0;
  for (let i = 0; i < d.length; i++) {
    sum += d[i];
    if (sum <= budget) {
      answer++;
    }
  }
  return answer;
}

console.log("--->", solution([2, 2, 3, 3], 10));
