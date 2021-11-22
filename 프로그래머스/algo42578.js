/**
 * https://programmers.co.kr/learn/courses/30/lessons/42578
 * 위장
 *
 * Object에서 value값만 빼오기 : Object.values(arr);
 */

function solution(clothes) {
  let closet = [];
  let tmp = {};
  let answer = 1;
  clothes.map((v) => {
    let key = v[1];
    tmp[key] = tmp[key] ? (tmp[key] += 1) : 1;
  });
  closet = Object.values(tmp);

  closet.map((v) => {
    answer = answer * Number(v + 1);
  });

  return answer - 1;
}

console.log(
  "--->",
  solution([
    ["yellowhat", "headgear"],
    ["bluesunglasses", "eyewear"],
    ["green_turban", "headgear"],
  ])
);
