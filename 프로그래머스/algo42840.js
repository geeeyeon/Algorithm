/**
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 * 모의고사
 *
 *  Math.max(...array) //배열로 쓸 때
 *  Math.max(1,2,3)
 */

function solution(answers) {
  let answer = [];
  let one = [1, 2, 3, 4, 5];
  let two = [2, 1, 2, 3, 2, 4, 2, 5];
  let three = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

  let rank = [0, 0, 0];

  for (let i = 0; i < answers.length; i++) {
    if (one[i % one.length] === answers[i]) rank[0]++;
    if (two[i % two.length] === answers[i]) rank[1]++;
    if (three[i % three.length] === answers[i]) rank[2]++;
  }
  console.log(rank);

  let highScore = Math.max(...rank);
  rank.map((v, i) => {
    if (v === highScore) answer.push(i + 1);
  });
  return answer;
}

console.log("--->", solution([1, 3, 2, 4, 2]));
