/* https://www.acmicpc.net/problem/10872
 * 팩토리얼
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력해라
 */
import java.util.Scanner;

public class algo10872팩토리얼 {

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
	
//---재귀함수로 풀면 런타임에러 발생	
	
//	static int factorial(int n) {
//		if(n==1)
//			return 1;
//		else
//			return n*factorial(n-1);
//	}

}
