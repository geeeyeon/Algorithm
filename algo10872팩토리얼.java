/* https://www.acmicpc.net/problem/10872
 * ���丮��
 * 0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ض�
 */
import java.util.Scanner;

public class algo10872���丮�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(factorial(input));
	}
	
	static int factorial(int n) {
		int output = 1;
		for(int i=1; i<=n; i++)
			output*=i;
		return output;
	}
	
//---����Լ��� Ǯ�� ��Ÿ�ӿ��� �߻�	
	
//	static int factorial(int n) {
//		if(n==1)
//			return 1;
//		else
//			return n*factorial(n-1);
//	}

}
