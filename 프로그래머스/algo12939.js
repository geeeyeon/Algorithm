/**
 * https://programmers.co.kr/learn/courses/30/lessons/12939
 * 최댓값과 최솟값
 */

function solution(s) {
  let answer = "";
  let tmp = s.split(" ");
  // console.log(tmp);
  tmp.sort((a, b) => a - b);
  // console.log(tmp);
  // console.log(tmp[0], tmp[tmp.length - 1]);
  answer = `${tmp[0]} ${tmp[tmp.length - 1]}`;
  return answer;
}

console.log("--->", solution("1 4 3 2"));
console.log("---2", solution("-1 -2 -3 -4"));
console.log("---3", solution("-1 -1"));
