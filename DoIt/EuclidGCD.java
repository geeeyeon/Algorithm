import java.util.Scanner;

public class EuclidGCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ������ �ִ� ������� ���մϴ�.");
		
		System.out.print("������ �Է��ϼ��� : ");
		int x = sc.nextInt();
		System.out.print("������ �Է��ϼ���  : ");
		int y = sc.nextInt();
		
		System.out.println("(���o)�ִ������� "+gcd(x,y)+"�Դϴ�.");
		System.out.println("(���x)�ִ������� "+gcd1(x,y)+"�Դϴ�.");

	}
	
	//���
	static int gcd(int x, int y) {
		if(y==0)
			return x;
		else
			return gcd(y,x%y);
	}
	//����Լ� ������
	static int gcd1(int x, int y) {
		while(y!=0) {
			int tmp = y;
			y = x%y;
			x = tmp;
		}
		return x;
	}

}
