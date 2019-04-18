import java.util.Scanner;

//배열 a의 모든 요소의 최대공약수를 구하기
public class GcdArray {
	static int gcd(int x, int y) {
		if(y==0)
			return x;
		else
			return gcd(y,x%y);
	}
	static int gcdArray(int a[], int start, int num) {
		if (num == 1)
			return a[start];
		else if (num == 2)
			return gcd(a[start], a[start + 1]);
		else
			return gcd(a[start], gcdArray(a, start + 1, num - 1));
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 몇 개의 최대 공약수를 구할까요?：");
		int num;
		do {
			num = stdIn.nextInt();//배열의 길이
		} while (num <= 1);

		int[] x = new int[num]; // 길이 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}//배열에 요소 넣기

		System.out.println("최대 공약수는 " + gcdArray(x, 0, num) + "입니다.");
	}

}
