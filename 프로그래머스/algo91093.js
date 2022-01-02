/**
 * https://programmers.co.kr/learn/courses/13213/lessons/91093
 * 입국심사
 * 이진탐색문제
 *
 */

function solution(n, times) {
  let sortedTimes = times.sort((a, b) => a - b);
  let left = 1;
  let right = sortedTimes[sortedTimes.length - 1] * n; //최악의경우

  while (left <= right) {
    let mid = Math.floor((left + right) / 2);
    let sum = times.reduce((acc, time) => acc + Math.floor(mid / time), 0);

    if (sum < n) {
      left = mid + 1;
    } else {
      right = mid - 1;
    }
  }
  return left;
}

console.log(solution(6, [7, 10]));
