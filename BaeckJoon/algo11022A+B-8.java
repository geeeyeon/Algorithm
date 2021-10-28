/*https://www.acmicpc.net/problem/11022
    A+B의 값을 깔끔하게 출력하기
 */
import java.util.*;

public class algo11022{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=1; i<=T ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));
        }
    }
}