/**
 * https://programmers.co.kr/learn/courses/30/lessons/72410
 * 신규 아이디 추천
 */

function solution(new_id) {
  let answer = "";
  const regex = /[^a-z0-9-_.]/g;
  const dot = /\.{2,}/g;
  answer = new_id.toLowerCase(new_id);
  answer = answer
    .replace(regex, "")
    .replace(dot, ".")
    .replace(/^\.|\.$/g, "");
  if (answer === "") answer = "a";
  if (answer.length > 15) {
    answer = answer.slice(0, 15).replace(/\.$/, "");
  } else if (answer.length < 4) {
    answer += answer.charAt(answer.length - 1).repeat(3 - answer.length);
  }
  return answer;
}

console.log(solution('"...!@BaT#*..y.abcdefghijklm"')); //"bat.y.abcdefghi"
console.log(solution("z-+.^.")); //"z--"
console.log(solution("=.=")); //"aaa"
console.log(solution("123_.def")); //"123_.def"
console.log(solution("abcdefghijklmn.p")); //"abcdefghijklmn"
