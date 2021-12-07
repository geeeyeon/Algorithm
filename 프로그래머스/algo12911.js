/**
 * https://programmers.co.kr/learn/courses/30/lessons/12911
 * 다음 큰 숫자*
 * shift 연산자로 풀 수 있지 않을까
 */

function solution(n) {
  let answer = n + 1;
  let num = n
    .toString(2)
    .split("")
    .filter((v) => v === "1").length;

  while (true) {
    let tmp = answer
      .toString(2)
      .split("")
      .filter((val) => val === "1").length;
    if (tmp === num) {
      break;
    }
    answer++;
  }

  // console.log(num);

  return answer;
}

console.log("--->", solution(78)); //83
console.log("--->", solution(15)); //23
