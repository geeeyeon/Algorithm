/* https://www.acmicpc.net/problem/10951
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
*/

import java.util.*;

public class algo10951{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);
        }
          
    }

}