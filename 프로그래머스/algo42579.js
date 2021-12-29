/**
 * https://programmers.co.kr/learn/courses/30/lessons/42579
 * 베스트앨범
 */

function solution(genres, plays) {
  let answer = [];
  let count = {};
  let genreCount = {};
  let genreSort = [];
  let answerLength = 0;

  genres.forEach((element, index) => {
    let a = plays[index];
    let tmp = [element, index, a];
    count[element] = count[element]
      ? (count[element] += plays[index])
      : plays[index];
    genreCount[element] = genreCount[element] ? (genreCount[element] += 1) : 1;
    genreSort.push(tmp);
  });
  // 재생 큰 순서대로 장르 정렬
  const sortable = Object.keys(
    Object.entries(count)
      .sort(([, a], [, b]) => b - a)
      .reduce((r, [k, v]) => ({ ...r, [k]: v }), {})
  );

  genreSort.sort((a, b) => b[2] - a[2]);
  Object.values(genreCount).forEach(
    (val) => (answerLength += val > 2 ? 2 : val)
  );
  while (answerLength > 0) {
    for (let i = 0; i < Object.keys(genreCount).length; i++) {
      let turn = genreCount[sortable[i]] > 2 ? 2 : 1;
      for (let j = 0; j < genreSort.length; j++) {
        if (sortable[i] === genreSort[j][0]) {
          if (turn > 3) {
            turn = 1;
            break;
          }
          answer.push(genreSort[j][1]);
          turn++;
          answerLength--;
        }
      }
    }
  }

  return answer;
}
console.log(
  "---->",
  solution(
    ["classic", "pop", "classic", "classic", "pop"],
    [500, 600, 150, 800, 2500]
  )
); //4,1,3,0
console.log(
  "---->",
  solution(
    ["classic", "pop", "classic", "classic", "pop", "test"],
    [500, 600, 150, 800, 2500, 100]
  )
); //[4,1,3,0,5]
console.log("---->", solution(["classic"], [300])); //[0]
