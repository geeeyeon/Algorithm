/**
 * https://programmers.co.kr/learn/courses/13213/lessons/91100
 * 그리디_큰 수 만들기
 */

function solution(number, k) {
  let tmp = [];
  let count = 0;
  for (let item of number) {
    while (count < k && tmp[tmp.length - 1] < item) {
      tmp.pop();
      count++;
    }
    tmp.push(item);
  }

  while (count < k) {
    tmp.pop();
    count++;
  }
  return tmp.join("");
}

// console.log("--->", solution("1924", 2)); //94
console.log("--->", solution("1231234", 3)); //3234
// console.log("--->", solution("4177252841", 4)); //775841
console.log("--->", solution("1234567", 2));
console.log("--->", solution("7654321", 2));
