/**
 * https://programmers.co.kr/learn/courses/30/lessons/68935
 * 3진법 뒤집기
 * 
 * x.toString(n) // 10진수 x값을 n진수로 변환
 * parseInt(x,n) // n진수 x값을 10진수로 변환
 */

 function solution(n){
    let tmp = [];
    tmp = n.toString(3).split('');
    tmp = tmp.reverse().join('');
    return parseInt(tmp,3);
    // console.log(answer);
}
console.log('--->',solution(45));