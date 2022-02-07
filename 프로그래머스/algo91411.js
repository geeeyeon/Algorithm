/**
 * https://programmers.co.kr/learn/courses/13213/lessons/91411
 * 최단 경로 알고리즘 _ 배달
 */

function solution(N, road, K) {
  let result = [Infinity, 0, ...new Array(N - 1).fill(Infinity)];
  let map = Array.from({ length: N + 1 }, () => []);
  road.forEach(([start, end, time]) => {
    map[start].push({ dst: end, time });
    map[end].push({ dst: start, time });
  });

  let target = [{ start: 1, baseTime: 0 }];

  while (target.length > 0) {
    const tmp = target.pop();
    map[tmp.start].forEach((val) => {
      if (val.time + tmp.baseTime < result[val.dst]) {
        result[val.dst] = tmp.baseTime + val.time;
        target.push({ start: val.dst, baseTime: tmp.baseTime + val.time });
      }
    });
  }
  return result.filter((v) => v <= K).length;
}

console.log(
  solution(
    6,
    [
      [1, 2, 1],
      [1, 3, 2],
      [2, 3, 2],
      [3, 4, 3],
      [3, 5, 2],
      [3, 5, 3],
      [5, 6, 1],
    ],
    4
  )
); //4
