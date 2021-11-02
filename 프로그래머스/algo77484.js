/**
 * https://programmers.co.kr/learn/courses/30/lessons/77484
 * 로또의 최고 순위와 최저 순위
 */

 function solution(lottos, win_nums){
    // 0 갯수
    let count = 0;
    lottos.filter(x=> x===0? count++ : null);

    // 로또번호 맞추기
    let match = 0;
    win_nums.filter(v=> lottos.includes(v) ? match++:null);
    
    // 순위 결정
    return [7-ranking(match+count),7-ranking(match)]    
}

function ranking(num){
    if(num>=6) return 6;
    else if(num<=1) return 1;
    else return num;
}

console.log('--->',solution([44,1,0,0,31,25],[31,10,45,1,6,19]));


