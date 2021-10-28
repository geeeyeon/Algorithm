
/*https://www.acmicpc.net/problem/1110
 * N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성
 */
import java.util.Scanner;

public class algo1110더하기사이클 {

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
