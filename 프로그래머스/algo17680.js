/**
 * https://programmers.co.kr/learn/courses/30/lessons/17680
 * 캐시 *
 * 반례 찾아보기..
 */

function solution(cacheSize, cities) {
  var answer = 0;
  // cities = cities.map((v) => v.toLowerCase());
  let window = [];
  let index = [];

  if (cacheSize === 0) return cities.length * 5;
  for (let i = 0; i < cities.length; i++) {
    let city = cities[i].toLowerCase();
    if (window.includes(city)) {
      let cityIdx = cities.indexOf(city); // 몇번째 인덱스에 있는지?
      index[cityIdx] = i;
      answer += 1;
    } else {
      if (window.length < cacheSize) {
        window.push(city);
        index.push(i);
      } else {
        let changeIdx = index.indexOf(Math.min(...index));
        index[changeIdx] = i;
        window[changeIdx] = city;
      }
      answer += 5;
    }
  }
  // console.log(window);

  return answer;
}

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
