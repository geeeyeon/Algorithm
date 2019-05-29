/*https://www.acmicpc.net/problem/1057
 * 토너먼트
 * 몇 번째 경기에서 김지민과 임한수가 대결하는지 구하기
 */
import java.util.Scanner;

public class algo1057토너먼트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//참가자
		int k = sc.nextInt();	//김지민 참가번호
		int l = sc.nextInt();	//임한수 참가번호
		
		int count=0;
		
		while(k!=l) {
			k = k/2+k%2;
			l = l/2+l%2;
			count++;
		}
		
		System.out.println(count);
	}

}
