
/*https://www.acmicpc.net/problem/1110
 * N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ�
 */
import java.util.Scanner;

public class algo1110���ϱ����Ŭ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		int tmp=input;
		int count=0;
		
		
		do {						
			tmp=tmp%10*10 + (tmp/10+tmp%10)%10;
			count++;			
		}while(tmp!=input);	

		
		System.out.println(count);
		
	} 

}
