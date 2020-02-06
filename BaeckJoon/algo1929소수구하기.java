/*https://www.acmicpc.net/problem/1929
 * 소수구하기
 * M이상 N이하의 소수를 모두 출력하는 프로그램
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo1929소수구하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M=Integer.parseInt(st.nextToken());
		int N=Integer.parseInt(st.nextToken());

		
		for(int i=M; i<=N; i++) {
			if(isPrime(i))
				System.out.println(i);
		}		
	}	
	
	static boolean isPrime(int n) {
		if(n==1) return false;
		for(int i=2; i<=Math.sqrt(n); i++)
			if(n%i==0) return false;
		return true;
	}

}
