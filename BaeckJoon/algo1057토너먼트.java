/*https://www.acmicpc.net/problem/1057
 * ��ʸ�Ʈ
 * �� ��° ��⿡�� �����ΰ� ���Ѽ��� ����ϴ��� ���ϱ�
 */
import java.util.Scanner;

public class algo1057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//������
		int k = sc.nextInt();	//������ ������ȣ
		int l = sc.nextInt();	//���Ѽ� ������ȣ
		
		int count=0;
		
		while(k!=l) {
			k = k/2+k%2;
			l = l/2+l%2;
			count++;
		}
		
		System.out.println(count);
	}

}
