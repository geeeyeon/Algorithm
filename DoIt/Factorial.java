import java.util.Scanner;

public class Factorial {
	//재귀함수 사용
	static int factorial(int n) {
		if(n>0)
			return n*factorial(n-1);
		else
			return 1;
	}
	//재귀함수를 사용하지 않고
	static int factorial1(int n) {
		int fac=1;
		while(n>1) {
			fac*=n--;
		}
		return fac;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		
		System.out.println("(재귀o)"+x+"의 팩토리얼은 "+factorial(x)+"입니다.");
		System.out.println("(재귀x)"+x+"의 팩토리얼은 "+factorial1(x)+"입니다.");
	}

}
