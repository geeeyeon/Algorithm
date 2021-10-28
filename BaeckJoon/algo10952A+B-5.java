/* https://www.acmicpc.net/problem/10952
    입력의 마지막에는 0 두 개가 들어온다.
*/

import java.util.*;

public class algo10952{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a==0 && b==0){
                break;
            }
            else{
                System.out.println(a+b);
            }
        }
    }
}