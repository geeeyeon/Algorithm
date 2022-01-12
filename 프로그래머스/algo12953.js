/**
 * https://programmers.co.kr/learn/courses/30/lessons/12953
 * N개의 최소공배수
 */

function solution(arr) {
  let answer = [];
  arr.sort((a, b) => a - b);
  answer.push(arr[0]);
  for (let i = 1; i < arr.length; i++) {
    let tmp = answer[answer.length - 1];
    answer.push(
      (arr[i] * tmp) / gcd(Math.max(tmp, arr[i]), Math.min(tmp, arr[i]))
    );
  }

  return answer.pop();
}

function gcd(num1, num2) {
  if (num2 === 0) return num1;
  else return gcd(num2, num1 % num2);
}

console.log("==>", solution([2, 6, 8, 14])); //168
console.log("==>", solution([1, 2, 3])); //6
