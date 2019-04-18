import java.util.Scanner;

//�迭 a�� ��� ����� �ִ������� ���ϱ�
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
		System.out.print("���� �� ���� �ִ� ������� ���ұ��?��");
		int num;
		do {
			num = stdIn.nextInt();//�迭�� ����
		} while (num <= 1);

		int[] x = new int[num]; // ���� num�� �迭

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = stdIn.nextInt();
		}//�迭�� ��� �ֱ�

		System.out.println("�ִ� ������� " + gcdArray(x, 0, num) + "�Դϴ�.");
	}

}
