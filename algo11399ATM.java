

/*https://www.acmicpc.net/problem/11399
 * ATM - 그리디알고리즘
 */
import java.util.Arrays;
import java.util.Scanner;

public class algo11399ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//사람 수
		int[] time = new int[N];
		
		for(int i=0; i<N; i++) {
			time[i]=sc.nextInt();
		}
		
		Arrays.sort(time);
		
		int sum=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<=i; j++) {
				sum+=time[j];
			}
		}
		
		System.out.println(sum);
	}

}
