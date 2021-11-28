/**
 * https://programmers.co.kr/learn/courses/30/lessons/12941
 * 최솟값 만들기
 */

function solution(A, B) {
  let answer = 0;
  A = A.sort((a, b) => {
    return a - b;
  });
  B = B.sort((a, b) => {
    return b - a;
  });

  for (let i = 0; i < A.length; i++) {
    answer += A[i] * B[i];
  }
  return answer;
}

console.log("--->", solution([1, 4, 2], [4, 4, 5]));
