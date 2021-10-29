/**
 * 두 개 뽑아서 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/68644
 * 
 */


 function solution(numbers){
    let answer=[];
    for(let i=0; i<numbers.length; i++){
        for(let j=0; j<numbers.length; j++){
            if(i!==j){
                answer.push(numbers[i]+numbers[j]);
            }
        }
    }
    return Array.from(new Set(answer.sort(function(a,b){return a-b;})));
}
console.log(solution([5,0,2,7]));

