/**
 * https://level.goorm.io/exam/47881/%EA%B7%BC%EB%AC%B5%EC%9E%90%ED%9D%91/quiz/1
 * 근묵자흑
 */

const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});
let input = [];
rl.on("line", function (line) {
  if (!line) {
    rl.close();
  } else {
    input.push(line);
  }
}).on("close", function () {
  solution(input);
  process.exit();
});

function solution(line) {
  let range = line[0].split(" ");
  console.log(Math.ceil((range[0] - range[1]) / (range[1] - 1)) + 1);
}
