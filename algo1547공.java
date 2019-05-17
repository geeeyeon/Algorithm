/*https://www.acmicpc.net/problem/1547
 * ��
 * ù° �ٿ� ���� ����ִ� ���� ��ȣ�� ����Ѵ�. ���� ������� �� �ؿ� ���� ��쿡�� -1�� ����Ѵ�.
 */
import java.util.Scanner;

public class algo1547�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] cup = {1,0,0}; //�׻� 1���ſ� ���� �ִ� ������ ����
		
		while(m-->0) {
			int a = sc.nextInt()-1;//�ٲ� �� ��ġ(�迭�̱⶧���� -1)
			int b = sc.nextInt()-1;//�ٲ� �� ��ġ
			
			int tmp = cup[a];
			cup[a] = cup[b];
			cup[b] = tmp;
		}
		for(int i=0; i<cup.length; i++) {
			if(cup[i]==1)//�ſ� ���� ����ִ�
				System.out.println(i+1);
		}
	}

}
