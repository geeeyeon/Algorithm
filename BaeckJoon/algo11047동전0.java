

/*https://www.acmicpc.net/problem/11047
 * ����0 - �׸���˰���
 */
import java.util.Scanner;

public class algo11047����0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //��������
		int K = sc.nextInt();
		
		int[] val = new int[N];
		for(int i=0; i<N; i++) {
			val[i]=sc.nextInt();//������ ��ġ
		}
		
		int result=0;
		
		for(int i=N-1; i>=0; i--) {
			result += K/val[i];
			K = K%val[i];
		}
		
		System.out.println(result);
	}

}
