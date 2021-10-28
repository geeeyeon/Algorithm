/*https://www.acmicpc.net/problem/2675
 * 문자열 반복
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
 * 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
 * */
import java.util.Scanner;

public class algo2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int R = sc.nextInt();
			String S = sc.nextLine();
			String output="";
			for(int j=0; j<S.length(); j++) {
				for(int k=0; k<R; k++) {
					output+=S.charAt(j);
				}
			}
			output=output.trim();//왜 빈칸이 출력되는지?
			System.out.println(output);
		}
	}

}
