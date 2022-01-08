/**
 * https://programmers.co.kr/learn/courses/13213/lessons/91097
 * 가장 먼 노드 - BFS
 */

function solution(n, vertex) {
  let graph = Array.from(new Array(n + 1), () => []);
  for (let [start, end] of vertex) {
    graph[start].push(end);
    graph[end].push(start);
  }

  let distance = new Array(n + 1).fill(0);
  distance[1] = 1;

  let queue = [1];

  while (queue.length > 0) {
    let shifted = queue.shift();

    for (let item of graph[shifted]) {
      if (distance[item] === 0) {
        queue.push(item);
        distance[item] = distance[shifted] + 1;
      }
    }
  }

  let maxDistance = Math.max(...distance);
  // console.log(maxDistance)
  return distance.filter((element) => element === maxDistance).length;
}

console.log(
  "--->",
  solution(6, [
    [3, 6],
    [4, 3],
    [3, 2],
    [1, 3],
    [1, 2],
    [2, 4],
    [5, 2],
  ])
); //3
