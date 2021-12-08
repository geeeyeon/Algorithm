/**
 * https://programmers.co.kr/learn/courses/18/lessons/1877
 * 순열검사
 */

function solution(arr) {
  var answer = true;

  arr.sort((a, b) => a - b);
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] !== i + 1) answer = false;
  }

  return answer;
}
