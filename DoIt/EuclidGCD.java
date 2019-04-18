import java.util.Scanner;

public class EuclidGCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수의 최대 공약수를 구합니다.");
		
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		System.out.print("정수를 입력하세요  : ");
		int y = sc.nextInt();
		
		System.out.println("(재귀o)최대공약수는 "+gcd(x,y)+"입니다.");
		System.out.println("(재귀x)최대공약수는 "+gcd1(x,y)+"입니다.");

	}
	
	//재귀
	static int gcd(int x, int y) {
		if(y==0)
			return x;
		else
			return gcd(y,x%y);
	}
	//재귀함수 사용안함
	static int gcd1(int x, int y) {
		while(y!=0) {
			int tmp = y;
			y = x%y;
			x = tmp;
		}
		return x;
	}

}
