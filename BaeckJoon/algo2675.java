/*https://www.acmicpc.net/problem/2675
 * ���ڿ� �ݺ�
 * ���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�.
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
			output=output.trim();//�� ��ĭ�� ��µǴ���?
			System.out.println(output);
		}
	}

}
