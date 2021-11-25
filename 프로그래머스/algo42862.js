/**
 * https://programmers.co.kr/learn/courses/30/lessons/42862
 * 체육복
 *
 * for문 줄여서 다시해보기*
 */

function solution(n, lost, reserve) {
  let answer = 0;
  let tmp = new Array(n).fill(1);

  for (let i = 0; i < lost.length; i++) {
    tmp[lost[i] - 1]--;
  }
  for (let j = 0; j < reserve.length; j++) {
    tmp[reserve[j] - 1]++;
  }

  // console.log("tmp>", tmp);

  for (let k = 0; k < tmp.length; k++) {
    if (tmp[k] === 0) {
      if (tmp[k - 1] === 2) {
        tmp[k - 1] = 1;
        tmp[k] = 1;
      } else if (tmp[k + 1] === 2) {
        tmp[k + 1] = 1;
        tmp[k] = 1;
      }
    }
  }

  for (let l = 0; l < tmp.length; l++) {
    tmp[l] >= 1 ? answer++ : null;
  }
  return answer;
}

console.log("--->", solution(5, [2, 4], [1, 3, 5]));
