/* https://www.acmicpc.net/problem/10809
 * ���ĺ� ã��
 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����.
 * �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ���
 * */
import java.util.Arrays;
import java.util.Scanner;

public class algo10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		int[] alpha = new int[26];
		Arrays.fill(alpha, -1); //�迭�� -1�� ä���
		//a�� �ƽ�Ű�ڵ� : 97
		
		for(int i=0; i<input.length(); i++) {
			if(alpha[input.charAt(i)-'a']==-1)
				alpha[input.charAt(i)-'a']=i;
		}
		for(int i=0; i<26; i++) {
			System.out.print(alpha[i]+" ");
		}
	}

}
