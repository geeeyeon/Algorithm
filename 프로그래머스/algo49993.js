/**
 * https://programmers.co.kr/learn/courses/30/lessons/49993
 * 스킬트리
 *
 */

function solution(skill, skill_trees) {
  let answer = 0;
  let step = skill.split("");
  let filter_skills = [];
  for (let i = 0; i < skill_trees.length; i++) {
    let target = skill_trees[i].split("");
    let tmp = [];
    target.filter((v) => {
      step.includes(v) ? tmp.push(v) : null;
    });
    filter_skills.push(tmp);
  }
  filter_skills.forEach((val, i) => {
    for (let j = 0; j < val.length; j++) {
      if (val[j] !== step[j]) return;
    }
    answer++;
  });

  return answer;
}

console.log(
  "--->",
  solution("CBDK", [
    "CB",
    "CXYB",
    "BD",
    "AECD",
    "ABC",
    "AEX",
    "CDB",
    "CBKD",
    "IJCB",
    "LMDK",
  ])
); //4
console.log("--->", solution("CBD", ["BACDE", "CBADF", "AECB", "BDA"])); //2
console.log("--->", solution("BDC", ["AAAABACA"])); //0
