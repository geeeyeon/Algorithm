/*[제곱근을 이용하여 소수 판별하기]
 * 입력받은 수가 소수인지 판별해보기 
 * 예를들어 101이 소수인지 판별한다면, 101의 제곱근인 10을 구하고 2~10으로 101을 나눌수 있는지 본다*/
import java.util.Scanner;

public class PrimeMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean ifPrime = isPrime(number);
		
		if(ifPrime)
			System.out.printf("%d는 소수다", number);
		else
			System.out.printf("%d는 소수가 아니다.", number);
	}
	
	public static boolean isPrime(int n) {
		boolean isS=true;
		for(int i=2; i<=(int)Math.sqrt(n);i++) {
			if(n%i==0) {
				isS=false;
				break;
			}
		}
		return isS;
	}

}
