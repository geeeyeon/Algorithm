/* https://www.acmicpc.net/problem/2747
 * 피보나치수
 * memoization으로 다시풀기
 * */

import java.util.Scanner;

public class algo2747피보나치수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();//0~입력 수까지
		
		int output = fibo(input);
		System.out.println(output);
	}
	static int fibo(int input) {
		if(input<=1)
			return input;
		else
			return fibo(input-2)+fibo(input-1);
	}

}
