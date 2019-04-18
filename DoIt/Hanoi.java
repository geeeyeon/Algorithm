import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ϳ����� ž");
		System.out.print("���� ���� : ");
		int n = sc.nextInt();
		
		move(n,1,3);
	}
	//����� ��ȣ�� 1��, 2��, 3���̶�� �� �� ��� ��ȣ�� ���� 6
	//���۱���� x, ��ǥ����� y��� �� ��, �߰������ 6-x-y�̴�.
	static void move(int n, int x, int y) {
		if(n > 1)
			move(n-1, x, 6-x-y);
		System.out.println("����["+n+"]��"+x+"��տ��� "+y+"������� �ű�");
		
		if(n>1)
			move(n-1, 6-x-y, y);
	}

}
