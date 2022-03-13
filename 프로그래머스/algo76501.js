/**
 * https://programmers.co.kr/learn/courses/30/lessons/76501
 * 음양더하기
 * *reduce함수 사용해보기
 */

function solution1(absolutes, signs) {
  let answer = 0;
  for (let i = 0; i < absolutes.length; i++) {
    signs[i] ? (answer += absolutes[i]) : (answer -= absolutes[i]);
  }

  return answer;
}

// reduce 함수 사용해서 다시 풀이
function solution(absolutes, signs) {
  return absolutes.reduce(
    (previous, current, index) => previous + current * (signs[index] ? 1 : -1),
    0
  );
}

console.log("--->", solution([4, 7, 12], [true, false, true])); //9
console.log("--->", solution([1, 2, 3], [false, false, true])); //0
