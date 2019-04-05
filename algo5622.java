/* https://www.acmicpc.net/problem/5622
 * 다이얼
 * 전화를 걸기 위해 필요한 시간구하기
 * */
import java.util.Scanner;

public class algo5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int output=0;
		for(int i=0; i<input.length(); i++) {
			char dial = input.charAt(i);
			
			if( 'A'<=dial && dial <= 'C')
				output+=3;
			else if('D'<=dial && dial <= 'F')
				output+=4;
			else if('G'<=dial && dial <= 'I')
				output+=5;
			else if('J'<=dial && dial <= 'L')
				output+=6;
			else if('M'<=dial && dial <= 'O')
				output+=7;
			else if('P'<= dial && dial <= 'S')
				output+=8;
			else if('T' <= dial && dial <= 'V')
				output+=9;
			else if('W'<= dial && dial <= 'Z')
				output+=10;
		}
			
		System.out.println(output);
	}

}


