/**
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 * 콜라츠 추측
 */

function solution(num) {
  var answer = 0;
  while (num !== 1) {
    // console.log('hi')
    if (num % 2 === 0) {
      num /= 2;
      answer++;
    } else {
      num *= 3;
      num += 1;
      answer++;
    }

    if (answer >= 500) {
      answer = -1;
      break;
    }
  }
  return answer;
}
console.log("--->", solution(6)); //8
console.log("--->", solution(16)); //4
console.log("--->", solution(626331)); //-1
