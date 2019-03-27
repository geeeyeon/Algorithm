/* https://www.acmicpc.net/problem/2920
 * 음계
 * 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다.
 * 1부터 8까지 차례대로 연주한다면 ascending, 
 * 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 
 * */
import java.util.Scanner;
public class algo2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] input = new int[8];
		for(int i=0; i<8; i++) {
			input[i]=sc.nextInt();
		}
		String result="";
		for(int i=0; i<input.length-1; i++) {
			if(input[i]==input[i+1]+1)
				result="descending"; //여기서 바로 프린트해버리면 8번출력
			else if(input[i]==input[i+1]-1)
				result="ascending";
			else
				result="mixed";
			break;
		}
		
		System.out.println(result);
		
	}

}
