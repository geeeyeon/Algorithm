/* 프로그래머스
 * https://programmers.co.kr/learn/courses/30/lessons/12937?language=java
 * 짝수와 홀수
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환
 *
 */

class Solution {
  public String solution(int num) {
      String answer = "";
      if(num%2==0)
          answer = "Even";

      else 		// else if(num%2==1)로 하면 왜안되는지?
          answer = "Odd";

      return answer;
  }
}