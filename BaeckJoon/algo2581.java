/* https://www.acmicpc.net/problem/2581
 * 소수
 * 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 골라
 * 합과, 최솟값을 찾아라. 소수가 없을때는 -1을 출력
 * */
import java.util.ArrayList;
import java.util.Scanner;

public class algo2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		ArrayList prime_num = new ArrayList();
		int sum=0, min=0;
		
		for(int i=M; i<=N; i++) {
			int check=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0)
					check++;				
			}
			if(check==2) {
				prime_num.add(i);//list에 더하기
				sum+=i;
			}
		}
		if(prime_num.size()==0)//list가 비어있을 때(소수가 없을 때)
			System.out.println("-1");
		else {
			System.out.println(sum);
			System.out.println(prime_num.get(0));//0번째 값 반환
		}
	}
		
}
