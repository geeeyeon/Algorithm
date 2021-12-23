/**
 * https://programmers.co.kr/learn/courses/30/lessons/1845
 * 폰켓몬
 *
 * Set을 사용하면 중복 제거된 배열이 리턴
 * const arr = [...new Set(nums)]; // [3,1,2]
 */

function solution(nums) {
  let tmp = {};
  let max = nums.length / 2;

  nums.forEach((val) => {
    tmp[val] = tmp[val] ? ++tmp[val] : 1;
  });
  console.log(Object.keys(tmp).length);
  return Object.keys(tmp).length > max ? max : Object.keys(tmp).length;
}

console.log("--->", solution([3, 1, 2, 3])); //2
console.log("--->", solution([3, 3, 3, 2, 2, 4])); //3
console.log("--->", solution([3, 3, 3, 2, 2, 2])); //2
