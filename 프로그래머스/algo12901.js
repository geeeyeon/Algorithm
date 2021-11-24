/**
 * https://programmers.co.kr/learn/courses/30/lessons/12901
 * 2016년
 *
 */
function solution(a, b) {
  const day = ["THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"];
  const dates = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

  let days = 0;
  for (let i = 0; i < a - 1; i++) {
    days += dates[i];
  }
  days += b;
  console.log(days);
  return day[days % 7];
}
