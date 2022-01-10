/**
 * https://programmers.co.kr/learn/courses/30/lessons/42583
 * 다리를 지나는 트럭
 */

function solution(bridge_length, weight, truck_weights) {
  let count = 0;
  let bridge = new Array(bridge_length).fill(0);
  while (true) {
    count++;
    bridge.shift();

    let sum = bridge.reduce((prev, cur) => prev + cur, 0);
    if (sum + truck_weights[0] <= weight) {
      let truck = truck_weights.shift();
      bridge.push(truck);
      sum += truck;
    } else {
      bridge.push(0);
    }

    if (sum === 0) break;
  }

  return count;
}

console.log("--->", solution(2, 10, [7, 4, 5, 6])); //8
console.log("--->", solution(100, 100, [10])); //101
console.log(
  "--->",
  solution(100, 100, [10, 10, 10, 10, 10, 10, 10, 10, 10, 10])
); //110
