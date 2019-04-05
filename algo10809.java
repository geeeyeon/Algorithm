/* https://www.acmicpc.net/problem/10809
 * 알파벳 찾기
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다.
 * 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력
 * */
import java.util.Arrays;
import java.util.Scanner;

public class algo10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		int[] alpha = new int[26];
		Arrays.fill(alpha, -1); //배열을 -1로 채운다
		//a의 아스키코드 : 97
		
		for(int i=0; i<input.length(); i++) {
			if(alpha[input.charAt(i)-'a']==-1)
				alpha[input.charAt(i)-'a']=i;
		}
		for(int i=0; i<26; i++) {
			System.out.print(alpha[i]+" ");
		}
	}

}
