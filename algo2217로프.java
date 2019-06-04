/*https://www.acmicpc.net/problem/2217
 * ���� - �׸���˰���
 */

import java.util.Arrays;
import java.util.Scanner;

public class algo2217���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//������ ����
		int[] l = new int[N];
		for(int i=0; i<N; i++) {
			l[i] = sc.nextInt();
		}
		Arrays.sort(l);	//������������ ����
		
		int output=0;
		for(int i=N-1; i>=0; i--) {
//			System.out.println("�迭 "+i+" : "+l[i]);
//			System.out.println(l[i]*(N-1));
			output=Math.max(output, l[i]*(N-i));
		}//Math.max(a,b) : a��b�� ū �� ���
		
		System.out.println(output);
	}

}
