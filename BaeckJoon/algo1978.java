/* https://www.acmicpc.net/problem/1978
 * �Ҽ� ã��
 * �־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ���
 * */
import java.util.Scanner;

public class algo1978 {
//�Ҽ� : 1�� �ڱ� �ڽ����θ� ���������� ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count=0;
		
		for(int i=0; i<input; i++) {
			int check=0;
			int search = sc.nextInt();
			for(int j=1; j<=search; j++) {
				if(search%j==0)
					check++;						
				
			}
			if(check==2)//1�� �ڱ� �ڽ����θ� ������������ Ȯ��
				count++;
		}
		System.out.println(count);
		
	}

}
