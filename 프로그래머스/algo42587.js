/**
 * https://programmers.co.kr/learn/courses/30/lessons/42587
 * 프린터
 */

function solution(priorities, location) {
  let answer = 0;

  while (true) {
    let max = Math.max(...priorities);
    let tmp = priorities.shift();

    if (tmp !== max) {
      priorities.push(tmp);
    } else {
      answer++;
      if (location === 0) return answer;
    }
    location--;
    if (location === -1) {
      location = priorities.length - 1;
    }
  }
}

console.log(solution([2, 1, 3, 2], 2)); //1
console.log(solution([1, 1, 9, 1, 1, 1], 0)); //5
