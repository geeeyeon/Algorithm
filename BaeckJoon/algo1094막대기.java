
/*https://www.acmicpc.net/problem/1094
 * ������ �ִ� ���� �� ���̰� ���� ª�� ���� �������� �ڸ���.
 * ������ ������ ���� X���� ũ�ų� ���ٸ�, ������ �ڸ� ������ ���� �� �ϳ��� ������.
 * �� ���� ���븦 Ǯ�� �ٿ��� Xcm�� ���� �� �ִ��� ����Ѵ�.
 */
import java.util.Scanner;

public class algo1094����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();//��������� �����
		int stick = 64;
		int count=0;
		while(stick>0) {			
			if(stick>x) {
				stick=stick/2; //���븦 ������ �ڸ���
			}else {
				x-=stick;
				count++;
			}
		}
		System.out.println(count);		
	}

}
