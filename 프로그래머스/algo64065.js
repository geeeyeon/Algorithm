/**
 * https://programmers.co.kr/learn/courses/30/lessons/64065
 * 튜플
 */

function solution(s) {
  let answer = [];
  let open = /\{/g;
  let close = /\}/g;
  let tmp = {};
  s = s.replace(open, "[").replace(close, "]");
  s = JSON.parse(s);
  for (let i = 0; i < s.length; i++) {
    s[i].forEach((element) => {
      tmp[element] = tmp[element] ? (tmp[element] += 1) : 1;
    });
  }
  let sortedArr = [];
  for (let val in tmp) {
    sortedArr.push([val, tmp[val]]);
  }

  sortedArr.sort((a, b) => b[1] - a[1]);

  answer = sortedArr.map((v) => {
    return Number(v[0]);
  });

  return answer;
}

console.log("=====>", solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")); //[2, 1, 3, 4]
console.log("=====>", solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")); //[3, 2, 4, 1]
console.log("=====>", solution("{{20,111},{111}}")); //[111, 20]
console.log("=====>", solution("{{123}}")); //	[123]
