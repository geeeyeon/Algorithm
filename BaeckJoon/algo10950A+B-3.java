/*https://www.acmicpc.net/problem/10950
    A+B의 값 출력하기
*/
import java.util.*;

public class algo10950{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=1; i<=T ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt(); 

            System.out.println(a+b);
        }
    }
}