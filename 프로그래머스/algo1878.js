/**
 * https://programmers.co.kr/learn/courses/18/lessons/1878
 * 나머지 한 점
 * 
 * XOR(다르면 1, 같으면 0) 이용해서 풀면
 * for(var i = 0; i < 3; i++) {
        answer[0] ^= v[i][0];
        answer[1] ^= v[i][1];
    }
 */

function solution(v) {
  let tmpX = [];
  let tmpY = [];

  for (let i = 0; i < v.length; i++) {
    if (tmpX.includes(v[i][0])) {
      tmpX.splice(tmpX.indexOf(v[i][0]), 1);
    } else {
      tmpX.push(v[i][0]);
    }
    if (tmpY.includes(v[i][1])) {
      tmpY.splice(tmpY.indexOf(v[i][1]), 1);
    } else {
      tmpY.push(v[i][1]);
    }
  }
  return tmpX.concat(tmpY);
}

console.log(
  "--->",
  solution([
    [1, 4],
    [3, 4],
    [3, 10],
  ])
);
console.log(
  "--->",
  solution([
    [1, 1],
    [2, 2],
    [1, 2],
  ])
);
