/**
 * https://programmers.co.kr/learn/courses/30/lessons/86491#
 * 최소직사각형
 * 
 * 다시풀어보기****
 * 숫자로 sort할때는 이런식으로 하기
 * score.sort(function(a, b) { // 오름차순
    return a - b;
    // 1, 2, 3, 4, 10, 11
});
 */

// function solution1(sizes) {
//   let maxL = 0;
//   let maxR = 0;
//   let tmp = [];

//   sizes.map((v) => {
//     v[0] > v[1] ? tmp.push([v[0], v[1]]) : tmp.push([v[1], v[0]]);
//   });

//   for (let j = 0; j < sizes.length; j++) {
//     maxL = tmp[j][0] > maxL ? tmp[j][0] : maxL;
//     maxR = tmp[j][1] > maxR ? tmp[j][1] : maxR;
//   }

//   return maxL * maxR;
// }

function solution(sizes) {
  let tmp = [0, 0]; //min,max
  sizes.map((v) => {
    tmp[0] = tmp[0] < Math.min(...v) ? Math.min(...v) : tmp[0];
    tmp[1] = tmp[1] < Math.max(...v) ? Math.max(...v) : tmp[1];
  });

  return tmp[0] * tmp[1];
}

console.log(
  "--->",
  solution([
    [60, 50],
    [30, 70],
    [60, 30],
    [80, 40],
  ])
); //4000
console.log(
  "--->",
  solution([
    [10, 7],
    [12, 3],
    [8, 15],
    [14, 7],
    [5, 15],
  ])
); //120
