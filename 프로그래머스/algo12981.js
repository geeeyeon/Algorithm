/**
 * https://programmers.co.kr/learn/courses/30/lessons/12981
 * 영어 끝말잇기
 */

function solution(n, words) {
  let stackedWords = [words[0]];
  let turn = 1;
  let who = 0;
  let error = false;
  let lastChar = words[0].charAt(words[0].length - 1);
  for (let i = 1; i < words.length; i++) {
    who = i + 1;
    if (stackedWords.length % n === 0) {
      turn++;
    }
    // console.log(words[i], turn);
    if (lastChar !== words[i].charAt(0)) {
      // console.log("끝말잇기가 아님");
      error = true;
      break;
    }
    if (stackedWords.indexOf(words[i]) === -1) {
      stackedWords.push(words[i]);
      lastChar = words[i].charAt(words[i].length - 1);
    } else {
      // console.log("중복단어 말함");
      error = true;
      break;
    }
  }

  return error ? [who % n === 0 ? n : who % n, turn] : [0, 0];
}

console.log(
  "--->",
  solution(3, [
    "tank",
    "kick",
    "know",
    "wheel",
    "land",
    "dream",
    "mother",
    "robot",
    "tank",
  ])
); //[3,3]
console.log(
  "--->",
  solution(5, [
    "hello",
    "observe",
    "effect",
    "take",
    "either",
    "recognize",
    "encourage",
    "ensure",
    "establish",
    "hang",
    "gather",
    "refer",
    "reference",
    "estimate",
    "executive",
  ])
); //[0,0]
console.log(
  "--->",
  solution(2, ["hello", "one", "even", "never", "now", "world", "draw"])
); //[1,3]
