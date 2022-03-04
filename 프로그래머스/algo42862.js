/**
 * https://programmers.co.kr/learn/courses/30/lessons/42862
 * 체육복
 *
 */

function solution(n, lost, reserve) {
  let students = new Array(n + 1).fill(1);

  students = students.map((v, i) => {
    let tmp = v;
    if (lost.includes(i)) tmp -= 1;
    if (reserve.includes(i)) tmp += 1;
    return (v = tmp);
  });

  for (let k = 0; k < students.length; k++) {
    if (students[k] === 0) {
      if (students[k - 1] === 2) {
        students[k - 1] -= 1;
        students[k] += 1;
      } else if (students[k + 1] === 2) {
        students[k + 1] -= 1;
        students[k] += 1;
      }
    }
  }

  return students.filter((val) => val > 0).length - 1;
}

console.log("--->", solution(5, [2, 4], [1, 3, 5])); //5
console.log("--->", solution(5, [2, 4], [3])); //4
console.log("--->", solution(3, [3], [1])); //2
