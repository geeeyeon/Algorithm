
/*https://www.acmicpc.net/problem/2748
 * 피보나치수2
 * 첫째 줄에 n이 주어지고, n은 90보다 작거나 같은 자연수이다.
 * 피보나치수1보다 수의 범위가 커졌기 때문에 int가 아닌 long을 사용하였다
 */
import java.util.Scanner;

public class algo2748피보나치수2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] pibo = new int[input+1];
		
		pibo[0]=0;
		pibo[1]=1;
		for(int i=2; i<pibo.length; i++) {
			pibo[i]=pibo[i-1]+pibo[i-2];
		}
		
		System.out.println(pibo[input]);
	}

}
