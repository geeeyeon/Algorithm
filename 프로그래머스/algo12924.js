/**
 * https://programmers.co.kr/learn/courses/30/lessons/12924
 * 숫자의  표현
 */

function solution(n) {
  let answer = 1;

  for (let i = 1; i <= Math.ceil(n / 2); i++) {
    let start = i;
    let tmpSum = 0;
    for (let j = start; j <= Math.ceil(n / 2); j++) {
      tmpSum += j;
      if (tmpSum === n) {
        answer++;
        break;
      } else if (tmpSum > n) {
        break;
      }
    }
  }

  return answer;
}

console.log(solution(15)); //4
