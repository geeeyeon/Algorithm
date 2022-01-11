/**
 * https://programmers.co.kr/learn/courses/30/lessons/12940
 * 최대공약수와 최소공배수
 * 유클리드호제법 사용
 */

function solution(n, m) {
  let answer = [];
  answer.push(gcd(Math.max(n, m), Math.min(n, m)));
  answer.push((n * m) / answer[0]);

  return answer;
}

function gcd(num1, num2) {
  if (num2 === 0) return num1;
  else return gcd(num2, num1 % num2);
}

console.log("==>", solution(3, 12)); //[3,12]
console.log("==>", solution(2, 5)); //[1,10]
