/* ���α׷��ӽ�
 * https://programmers.co.kr/learn/courses/30/lessons/12937?language=java
 * ¦���� Ȧ��
 * ���� num�� ¦���� ��� "Even"�� ��ȯ�ϰ� Ȧ���� ��� "Odd"�� ��ȯ
 *
 */

class Solution {
  public String solution(int num) {
      String answer = "";
      if(num%2==0)
          answer = "Even";

      else 		// else if(num%2==1)�� �ϸ� �־ȵǴ���?
          answer = "Odd";

      return answer;
  }
}