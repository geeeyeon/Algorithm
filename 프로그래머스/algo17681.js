/**
 * [1차] 비밀지도
 *https://programmers.co.kr/learn/courses/30/lessons/17681
 */ 

function solution(n, arr1, arr2){
    let newArr=[];
    let Narr1 = toBinary(n,arr1);
    let Narr2 = toBinary(n,arr2);

    for(let i=0; i<n; i++){
        let tmp = [];
        for(let j=0; j<n; j++){
            tmp.push(Narr1[i].charAt(j) === '1' || Narr2[i].charAt(j)==='1' ? '#': ' ');
        }
        newArr.push(tmp.join(''))
    }
    return newArr;    
}
function toBinary(n,arr) {
    let tmp = [];
    for(let i=0; i<arr.length; i++){
        tmp.push(arr[i].toString(2).padStart(n,'0'));
    }
    return tmp;
}
// toBinary(5,[0,2,10]);
solution(5,[9, 20, 28, 18, 11],[30, 1, 21, 17, 28]);

//["#####","# # #", "### #", "# ##", "#####"]