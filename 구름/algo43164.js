/**
 * https://level.goorm.io/exam/43164/%EC%A0%90%EC%8B%AC%EC%9D%80-%ED%96%84%EB%B2%84%EA%B1%B0/quiz/1
 * 점심은 햄버거
 */

const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let tmp = [];
rl.on("line", function (line) {
  // console.log(line);
  if (!line) {
    rl.close();
  } else {
    tmp.push(line);
    if (tmp.length === 3) calcLunch(tmp);
  }
}).on("close", function () {
  process.exit();
});

function calcLunch(arr) {
  let microwave = arr[1].split(" ");
  let eat = arr[2].split(" ");
  microwave.sort((a, b) => a - b);
  console.log(
    eat.reduce(
      (prev, curt) => Number(prev) + Number(curt),
      Number(microwave[0])
    )
  );
}
