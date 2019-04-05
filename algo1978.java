/* https://www.acmicpc.net/problem/1978
 * 소수 찾기
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력
 * */
import java.util.Scanner;

public class algo1978 {
//소수 : 1과 자기 자신으로만 나누어지는 수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count=0;
		
		for(int i=0; i<input; i++) {
			int check=0;
			int search = sc.nextInt();
			for(int j=1; j<=search; j++) {
				if(search%j==0)
					check++;						
				
			}
			if(check==2)//1과 자기 자신으로만 나누어지는지 확인
				count++;
		}
		System.out.println(count);
		
	}

}
