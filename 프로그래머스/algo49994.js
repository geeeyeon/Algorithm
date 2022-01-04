/**
 * https://programmers.co.kr/learn/courses/30/lessons/49994
 * 방문 길이
 */
function solution(dirs) {
  let currentPoint = [0, 0];
  let road = new Set();
  let newCurrentPoint = new Array(2).fill(0);

  for (let i = 0; i < dirs.length; i++) {
    if (dirs[i] === "U") {
      newCurrentPoint = [currentPoint[0], currentPoint[1] + 1];
    } else if (dirs[i] === "D") {
      newCurrentPoint = [currentPoint[0], currentPoint[1] - 1];
    } else if (dirs[i] === "R") {
      newCurrentPoint = [currentPoint[0] + 1, currentPoint[1]];
    } else if (dirs[i] === "L") {
      newCurrentPoint = [currentPoint[0] - 1, currentPoint[1]];
    }

    if (
      newCurrentPoint[0] > -6 &&
      newCurrentPoint[0] < 6 &&
      newCurrentPoint[1] > -6 &&
      newCurrentPoint[1] < 6
    ) {
      let tmp = `${currentPoint[0]}${currentPoint[1]}${newCurrentPoint.join(
        ""
      )}`;
      let tmp2 = `${newCurrentPoint.join("")}${currentPoint[0]}${
        currentPoint[1]
      }`;
      road.add(tmp);
      road.add(tmp2);
      currentPoint = newCurrentPoint;
    }
  }
  // console.log("solution>,", road);

  return road.size / 2;
}

console.log(solution("ULURRDLLU")); //7
console.log(solution("LULLLLLLU")); //7
console.log(solution("LLLLRLRLRLL")); //5
