/*https://www.acmicpc.net/problem/1065
 * 한 수 - 브루트포스
 */
import java.util.Scanner;

public class algo1065한수 {
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<100) {
			count=n;
		}
		else {
			count+=99;
			for(int i=100; i<=n; i++) {
				int a = i/100;
				int b = (i/10)%10;
				int c = i%10;
				
				if(a-b == b-c)
					count++;
			}
		}
		
		System.out.println(count);
	}	
	
}
