/* https://www.acmicpc.net/problem/2581
 * �Ҽ�
 * �ڿ��� M�� N�� �־��� �� M�̻� N������ �ڿ��� �� �Ҽ��� ���� ���
 * �հ�, �ּڰ��� ã�ƶ�. �Ҽ��� �������� -1�� ���
 * */
import java.util.ArrayList;
import java.util.Scanner;

public class algo2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		ArrayList prime_num = new ArrayList();
		int sum=0, min=0;
		
		for(int i=M; i<=N; i++) {
			int check=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0)
					check++;				
			}
			if(check==2) {
				prime_num.add(i);//list�� ���ϱ�
				sum+=i;
			}
		}
		if(prime_num.size()==0)//list�� ������� ��(�Ҽ��� ���� ��)
			System.out.println("-1");
		else {
			System.out.println(sum);
			System.out.println(prime_num.get(0));//0��° �� ��ȯ
		}
	}
		
}
