/**
 * https://programmers.co.kr/learn/courses/30/lessons/42842
 * 카펫 **
 *
 * 약수를 안구하고 푸는방법 생각해보기
 */

function solution(brown, yellow) {
  let answer = [];
  let ynum = []; //약수
  for (let i = 1; i <= yellow; i++) {
    if (yellow % i === 0) {
      ynum.push(i);
    }
  }

  for (let i = 0; i < ynum.length; ) {
    if (ynum.length % 2 === 0) {
      if ((ynum[i] + 2 + ynum[ynum.length - 1]) * 2 === brown) {
        answer.push(ynum[ynum.length - 1] + 2, ynum[i] + 2);
      }
    } else {
      if ((ynum[i] + 2) * 4 - 4 === brown) {
        answer.push(ynum[i] + 2, ynum[i] + 2);
      }
    }
    ynum.pop();
    ynum.shift();
  }

  return answer;
}

console.log("--->", solution(10, 2)); //[4,3]
console.log("--->", solution(8, 1)); //[3,3]
console.log("--->", solution(24, 24)); //[8,6]
