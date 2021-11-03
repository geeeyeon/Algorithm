/**
 * https://programmers.co.kr/learn/courses/30/lessons/86491#
 * 최소직사각형
 * 
 * 다시풀어보기****
 * 숫자로 sort할때는 이런식으로 하기
 * score.sort(function(a, b) { // 오름차순
    return a - b;
    // 1, 2, 3, 4, 10, 11
});
 */

 function solution(sizes){
    let maxL=0;
    let maxR=0;
    let tmp = [];
    
    sizes.map((v)=>{
       v[0]>v[1] ? tmp.push([v[0],v[1]]) : tmp.push([v[1],v[0]]);
    })
    
    for(let j=0; j<sizes.length; j++){
        maxL = tmp[j][0] > maxL ? tmp[j][0]:maxL;
        maxR = tmp[j][1] > maxR ? tmp[j][1]:maxR;
    }

    return maxL*maxR;
}
console.log('--->',solution([[60, 50], [30, 70], [60, 30], [80, 40]]));