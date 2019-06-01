

/*https://www.acmicpc.net/problem/11047
 * 동전0 - 그리디알고리즘
 */
import java.util.Scanner;

public class algo11047동전0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //동전종류
		int K = sc.nextInt();
		
		int[] val = new int[N];
		for(int i=0; i<N; i++) {
			val[i]=sc.nextInt();//동전의 가치
		}
		
		int result=0;
		
		for(int i=N-1; i>=0; i--) {
			result += K/val[i];
			K = K%val[i];
		}
		
		System.out.println(result);
	}

}
