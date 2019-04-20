import java.util.Scanner;

public class Factorial {
	//����Լ� ���
	static int factorial(int n) {
		if(n>0)
			return n*factorial(n-1);
		else
			return 1;
	}
	//����Լ��� ������� �ʰ�
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
		System.out.print("������ �Է��ϼ��� : ");
		int x = sc.nextInt();
		
		System.out.println("(���o)"+x+"�� ���丮���� "+factorial(x)+"�Դϴ�.");
		System.out.println("(���x)"+x+"�� ���丮���� "+factorial1(x)+"�Դϴ�.");
	}

}
