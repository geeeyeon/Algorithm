/* https://www.acmicpc.net/problem/8958
 * OX퀴즈
 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
 * 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
 */
import java.util.Scanner;
public class algo8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine(); //바로 다음 입력 받기 위해서 추가
		
		for(int i=0; i<num; i++) {
			String input = sc.nextLine();
			int score=0;
			int result=0;
			
			for(int j=0; j<input.length(); j++) {
				if(input.charAt(j)=='O') { //O이면 점수 증가
					score++;
					result+=score;
				}
				else{
					score=0;
				}
			}
			System.out.println(result);
		}
		      
	}

}
