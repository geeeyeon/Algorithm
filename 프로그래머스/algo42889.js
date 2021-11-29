/** https://programmers.co.kr/learn/courses/30/lessons/42889
 * 실패율
 * Object.entries(obj) – [키, 값] 쌍을 담은 배열을 반환합니다
 * Object.keys(obj) – 객체의 키만 담은 배열을 반환합니다.
 * Object.values(obj) – 객체의 값만 담은 배열을 반환합니다.
 */

function solution(N, stages) {
  let answer = [];
  let tmp = {};
  let count = new Array(N).fill(0);

  for (let i = 0; i < stages.length; i++) {
    for (let j = 0; j < stages[i]; j++) {
      if (j < N) {
        tmp[j + 1] ? (tmp[j + 1] += 1) : (tmp[j + 1] = 1);
      }
    }
    count[stages[i] - 1]++;
  }

  for (let k = 0; k < N; k++) {
    tmp[String(k + 1)] /= count[k];
  }

  tmp = Object.entries(tmp).sort((a, b) => a[1] - b[1]);

  tmp.map((v) => {
    answer.push(Number(v[0]));
  });
  return answer;
}

console.log("--->", solution(4, [4, 4, 4, 4, 4]));
console.log("--->", solution(5, [2, 1, 2, 6, 2, 4, 3, 3]));
