/**
 * https://programmers.co.kr/learn/courses/30/lessons/12980
 * 점프와 순간 이동
 */

function solution(n) {
  let answer = 0;

  while (n !== 0) {
    if (n % 2 === 0) {
      n = n / 2;
    } else {
      n = n - 1;
      answer++;
    }
  }

  return answer;
}

console.log(solution(5)); //2
console.log(solution(6)); //2
console.log(solution(5000)); //5
