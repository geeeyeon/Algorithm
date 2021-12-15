/**
 * https://programmers.co.kr/learn/courses/13213/lessons/91078
 * 큐_프린터 실습
 */
function solution(priorities, location) {
  let answer = 0;

  while (true) {
    let max = Math.max(...priorities);
    let n = priorities.shift();
    if (max === n) {
      answer++;
      if (location === 0) return answer;
    } else {
      priorities.push(n);
    }
    location--;
    if (location === -1) {
      location = priorities.length - 1;
    }
  }
}
console.log(solution([2, 1, 3, 2], 2)); //1
console.log(solution([1, 1, 9, 1, 1, 1], 0)); //5
console.log(solution([1, 2, 8, 3, 4], 4)); //2
console.log(solution([3, 3, 4, 2], 3)); //4
