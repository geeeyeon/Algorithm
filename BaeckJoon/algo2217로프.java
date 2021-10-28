/*https://www.acmicpc.net/problem/2217
 * 로프 - 그리디알고리즘
 */

import java.util.Arrays;
import java.util.Scanner;

public class algo2217로프 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//로프의 개수
		int[] l = new int[N];
		for(int i=0; i<N; i++) {
			l[i] = sc.nextInt();
		}
		Arrays.sort(l);	//오름차순으로 정렬
		
		int output=0;
		for(int i=N-1; i>=0; i--) {
//			System.out.println("배열 "+i+" : "+l[i]);
//			System.out.println(l[i]*(N-1));
			output=Math.max(output, l[i]*(N-i));
		}//Math.max(a,b) : a와b중 큰 수 출력
		
		System.out.println(output);
	}

}
