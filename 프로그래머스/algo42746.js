/**
 * https://programmers.co.kr/learn/courses/30/lessons/42746
 * 가장 큰 수
 */

function solution(numbers) {
  let answer = [];
  let zeroCount = 0;

  zeroCount = numbers.filter((element) => element === 0).length;
  answer = numbers.sort(
    (a, b) => String(a).padEnd(4, String(a)) - String(b).padEnd(4, String(b))
  );

  if (zeroCount === answer.length) {
    answer = "0";
  } else {
    answer = answer.reverse().join("");
  }
  return answer;
}

console.log(solution([6, 10, 2])); //6210
console.log(solution([3, 30, 34, 5, 9])); //9534330
console.log(solution([0, 0, 0, 0, 0])); //0
