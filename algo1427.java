/* https://www.acmicpc.net/problem/1427
 * ��Ʈ�λ��̵�
 * ù° �ٿ� �����ϰ��� �ϴ� �� N�� �Է¹޾� �� �ڸ����� ������������ ����
 * */
import java.util.Scanner;

public class algo1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int[] str = new int[input.length()];
		for(int i=0; i<input.length(); i++) {
			str[i]=input.charAt(i)-'0';
		}
		
		int tmp;
		for(int i=0; i<input.length()-1; i++) {
			for(int j=0; j<input.length()-i-1; j++) {
				if(str[j]<str[j+1]) {
					tmp=str[j];
					str[j]=str[j+1];
					str[j+1]=tmp;
				}
			}
		}
		for(int i=0; i<input.length(); i++) {
			System.out.print(str[i]);
		}
	}
}
