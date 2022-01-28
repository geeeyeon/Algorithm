/**
 * https://programmers.co.kr/learn/courses/30/lessons/12921
 * 소수 찾기
 * 1부터 입력받은 N 사이에 있는 소수의 개수 구하기
 */

function solution(n) {
  let arr = [false, false, ...new Array(n - 1).fill(true)];
  for (let i = 2; i * i <= n; i++) {
    if (arr[i]) {
      for (let j = i * 2; j <= n; j += i) {
        arr[j] = false;
      }
    }
  }
  return arr.filter((ele) => ele === true).length;
}

// function solution(n) {
//   let answer = 0;

//   for (let i = 2; i <= n; i++) {
//     console.log(i, "->", isPrime(i));
//     if (isPrime(i)) answer++;
//   }
//   return answer;
// }

// function isPrime(n) {
//   // console.log("%%%", parseInt(Math.sqrt(n)));
//   if (n === 2) return true;
//   for (let i = 2; i <= parseInt(Math.sqrt(n)); i++) {
//     if (n % i === 0) {
//       return false;
//     }
//   }
//   return true;
// }
