/**
 * https://programmers.co.kr/learn/courses/30/lessons/17680
 * 캐시
 */

function solution(cacheSize, cities) {
  let answer = 0;

  let cache = [];
  if (cacheSize === 0) return cities.length * 5;
  cities.forEach((ele) => {
    let city = ele.toLowerCase();
    if (cache.includes(city)) {
      answer += 1;
      let cityIdx = cache.indexOf(city);
      cache.splice(cityIdx, 1);
      cache.push(city);
    } else {
      answer += 5;
      if (cache.length < cacheSize) {
        cache.push(city);
      } else {
        cache.shift();
        cache.push(city);
      }
    }
  });
  return answer;
}
console.log("--->", solution(0, ["LA", "LA"])); //10

console.log(
  "--->",
  solution(3, [
    "Jeju",
    "Pangyo",
    "Seoul",
    "NewYork",
    "LA",
    "Jeju",
    "Pangyo",
    "Seoul",
    "NewYork",
    "LA",
  ])
); //50
console.log(
  "--->",
  solution(3, [
    "Jeju",
    "Pangyo",
    "Seoul",
    "Jeju",
    "Pangyo",
    "Seoul",
    "Jeju",
    "Pangyo",
    "Seoul",
  ])
); //21
console.log(
  "--->",
  solution(2, [
    "Jeju",
    "Pangyo",
    "Seoul",
    "NewYork",
    "LA",
    "SanFrancisco",
    "Seoul",
    "Rome",
    "Paris",
    "Jeju",
    "NewYork",
    "Rome",
  ])
); //60
console.log(
  "--->",
  solution(5, [
    "Jeju",
    "Pangyo",
    "Seoul",
    "NewYork",
    "LA",
    "SanFrancisco",
    "Seoul",
    "Rome",
    "Paris",
    "Jeju",
    "NewYork",
    "Rome",
  ])
); //52
console.log("--->", solution(2, ["Jeju", "Pangyo", "NewYork", "newyork"])); //16
console.log("--->", solution(0, ["Jeju", "Pangyo", "Seoul", "NewYork", "LA"])); //25
