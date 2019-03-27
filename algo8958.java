/* https://www.acmicpc.net/problem/8958
 * OX����
 * "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�.
 * ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�.
 */
import java.util.Scanner;
public class algo8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine(); //�ٷ� ���� �Է� �ޱ� ���ؼ� �߰�
		
		for(int i=0; i<num; i++) {
			String input = sc.nextLine();
			int score=0;
			int result=0;
			
			for(int j=0; j<input.length(); j++) {
				if(input.charAt(j)=='O') { //O�̸� ���� ����
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
