/* https://www.acmicpc.net/problem/2292
 * ����
 * �Է����� �־��� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� �������� ���
 * */
import java.util.Scanner;

public class algo2292 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt();//�˻��� ������ȣ
		int result;
		int room=1;//���� ��
		int sum=1;//�� ������ ��
		
		while(true) {
			sum+=6*(room-1);
			if(sum>=search) {
				result=room;
				break;
			}
			room++;			
		}
		System.out.println(result);	
		
	}
}
