/*https://www.acmicpc.net/problem/9095
 * 1,2,3 더하기
 * 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램
 */

import java.util.Scanner;

public class algo9095더하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int n;
		
		int[] arr = new int[11];
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		for(int i=0; i<T; i++) {
			n = sc.nextInt();
			
			for(int j=4;j<=n;j++) {
				arr[j]=arr[j-1]+arr[j-2]+arr[j-3];
			}
			System.out.println(arr[n]);
		}
	}

}
