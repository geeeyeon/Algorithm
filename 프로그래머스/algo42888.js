/**
 * https://programmers.co.kr/learn/courses/30/lessons/42888
 * 오픈채팅방
 *
 */
function solution(record) {
  let answer = [];
  let idMatch = {};
  record.map((v) => {
    let tmp = v.split(" ");
    if (tmp[0] === "Enter" || tmp[0] === "Change") {
      idMatch[tmp[1]] = tmp[2];
    }
  });
  // console.log(idMatch);
  record.map((v) => {
    let info = "";
    let tmp = v.split(" ");
    if (tmp[0] === "Enter") {
      info += `${idMatch[tmp[1]]}님이 들어왔습니다.`;
      answer.push(info);
    } else if (tmp[0] === "Leave") {
      info += `${idMatch[tmp[1]]}님이 나갔습니다.`;
      answer.push(info);
    }
  });
  return answer;
}

console.log(
  solution([
    "Enter uid1234 Muzi",
    "Enter uid4567 Prodo",
    "Leave uid1234",
    "Enter uid1234 Prodo",
    "Change uid4567 Ryan",
  ])
); //["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
