/**
 * https://programmers.co.kr/learn/courses/30/lessons/12926
 * 시저암호
 *
 * 문자->코드 String.fromCodePoint(num)
 * 코드->문자 Str.charCodeAt(i)
 */

function solution(s, n) {
  let answer = "";
  let small = /[a-z]/;
  let big = /[A-Z]/;
  for (let i = 0; i < s.length; i++) {
    if (s[i] === " ") answer += " ";
    else if (s[i].match(small)) {
      let num = s.charCodeAt(i);
      num += n;
      if (num > 122) {
        num -= 26;
      }
      answer += String.fromCodePoint(num);
    } else if (s[i].match(big)) {
      let num = s.charCodeAt(i);
      num += n;
      if (num > 90) {
        num -= 26;
      }
      answer += String.fromCodePoint(num);
    }
  }

  return answer;
}

console.log("--->", solution("AB", 1));
console.log("--->", solution("z", 1));
console.log("--->", solution("a B z", 4));
