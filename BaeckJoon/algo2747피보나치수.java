

import java.util.Scanner;

public class algo2747피보나치수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();//0~입력 수까지
		
		int output = fibo(input);
		System.out.println(output);
	}
	static int fibo(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		int a=0,b=1;
		int c = 0;
		for(int i=2; i<=n; i++) {
			c=a+b;
			a=b;
			b=c;			
		}
		return c;
	}
//	static int fibo(int input) {	//시간초과 발생
//		if(input<=1)
//			return input;
//		else
//			return fibo(input-2)+fibo(input-1);
//	}

}
