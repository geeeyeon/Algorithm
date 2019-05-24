/*[�������� �̿��Ͽ� �Ҽ� �Ǻ��ϱ�]
 * �Է¹��� ���� �Ҽ����� �Ǻ��غ��� 
 * ������� 101�� �Ҽ����� �Ǻ��Ѵٸ�, 101�� �������� 10�� ���ϰ� 2~10���� 101�� ������ �ִ��� ����*/
import java.util.Scanner;

public class PrimeMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean ifPrime = isPrime(number);
		
		if(ifPrime)
			System.out.printf("%d�� �Ҽ���", number);
		else
			System.out.printf("%d�� �Ҽ��� �ƴϴ�.", number);
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
