/**
 * https://programmers.co.kr/learn/courses/30/lessons/49993
 * 스킬트리
 *
 */

function solution(skill, skill_trees) {
  let answer = 0;
  let step = skill.split("");
  let tmp = new Array(skill_trees.length).fill(-1);

  for (let i = 0; i < step.length; i++) {
    skill_trees.map((v, i) => {
      let idx = v.indexOf(step[i]);
      if (idx > tmp[i]) tmp[i] = idx;
      else if (idx < tmp[i]) tmp[i] = 100;
      else if (idx === -1) tmp[i] = -1;
    });
  }
  console.log(tmp);

  tmp.map((v) => {
    if (v >= 0) {
      answer++;
    }
  });
  return answer;
}

console.log("--->", solution("CBD", ["C", "D", "CB", "BDA"]));
