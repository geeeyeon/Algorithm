/* https://www.acmicpc.net/problem/2908
 * 상수
 * 입력된 두 수를 거꾸로 읽었을 때 큰 수를 출력하여라
 * */
import java.util.Scanner;

public class algo2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] input = new int[2];
		int[] output = new int[2];
		for(int i=0; i<2; i++) {
			input[i]=sc.nextInt();
			
			output[i]=(input[i]/100)+((input[i]%100)/10)*10+(input[i]%10)*100;
		}
		System.out.println((output[0]>output[1])?output[0]:output[1]);	
		
	}

}
