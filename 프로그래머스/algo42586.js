/**
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 * 기능개발 - 스택/큐
 *
 */

function solution(progresses, speeds) {
  let answer = [0];
  let remainDate = [];

  progresses.map((prg, idx) => {
    remainDate.push(Math.ceil((100 - prg) / speeds[idx]));
  });

  let maxProg = remainDate[0];
  let j = 0;
  for (let i = 0; i < remainDate.length; i++) {
    if (maxProg >= remainDate[i]) {
      answer[j] += 1;
    } else {
      maxProg = remainDate[i];
      j += 1;
      answer[j] = 1;
    }
  }

  return answer;
}

console.log("--->", solution([95, 90, 99, 99, 80, 99], [1, 1, 1, 1, 1, 1]));
