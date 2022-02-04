/**
 * https://programmers.co.kr/learn/courses/30/lessons/17682
 * 다트 게임
 */

function solution(dartResult) {
  let answer = 0;
  let tmp = dartResult.split(/([0-9]*[S|D|T])/i);
  let nums = [];

  for (let i = 0; i < tmp.length; i++) {
    if (tmp[i] === "") continue;
    else if (tmp[i] === "*" || tmp[i] === "#") nums.push(tmp[i]);
    else {
      let tmp_score = tmp[i];
      let powNum = 1;
      if (tmp_score.charAt(tmp_score.length - 1) === "S") powNum = 1;
      else if (tmp_score.charAt(tmp_score.length - 1) === "D") powNum = 2;
      else if (tmp_score.charAt(tmp_score.length - 1) === "T") powNum = 3;
      nums.push(Math.pow(tmp_score.match(/[0-9]*/gi)[0], powNum));
    }
  }
  nums.map((v, i) => {
    if (v === "#") {
      nums[i - 1] *= -1;
    } else if (v === "*") {
      nums[i - 1] *= 2;
      if (i - 2 >= 0) {
        if (typeof nums[i - 2] !== "number") nums[i - 3] *= 2;
        else nums[i - 2] *= 2;
      }
    }
    return nums;
  });

  nums.forEach((ele) => {
    if (typeof ele === "number") answer += ele;
  });
  return answer;
}

console.log(solution("1S2D*3T")); //37
console.log(solution("1D2S#10S")); //9
console.log(solution("1S*2T*3S")); //23
