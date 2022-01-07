/**
 * https://programmers.co.kr/learn/courses/30/lessons/42885
 * 구명보트
 * Math.max 이용 => 시간초과
 * 이분탐색 사용해서 풀기
 */

function solution(people, limit) {
  let answer = 0;
  people.sort((a, b) => b - a);
  let leftPoint = 0;
  let rightPoint = people.length - 1;
  while (leftPoint <= rightPoint) {
    if (people[leftPoint] + people[rightPoint] <= limit) {
      leftPoint++;
      rightPoint--;
    } else {
      leftPoint++;
    }
    answer++;
  }
  return answer;
}

console.log("--->", solution([70, 50, 80, 50], 100)); //3
console.log("--->", solution([70, 80, 50], 100)); //3
console.log("--->", solution([40, 50, 150, 160], 200)); //2
