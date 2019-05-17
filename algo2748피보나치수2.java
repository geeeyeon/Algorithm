
/*https://www.acmicpc.net/problem/2748
 * �Ǻ���ġ��2
 * ù° �ٿ� n�� �־�����, n�� 90���� �۰ų� ���� �ڿ����̴�.
 * �Ǻ���ġ��1���� ���� ������ Ŀ���� ������ int�� �ƴ� long�� ����Ͽ���
 */
import java.util.Scanner;

public class algo2748�Ǻ���ġ��2 {

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
