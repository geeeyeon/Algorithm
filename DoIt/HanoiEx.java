//�ϳ��� ž ���� �ٲٱ�
//����� ��ȣ�� �ƴ� A���,B���,C������� ǥ���ϱ�
import java.util.Scanner;

public class HanoiEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ϳ����� ž");
		System.out.print("������ ������ �Է��ϼ��� : ");
		int n = sc.nextInt();
		
		move(n,1,3);
	}
	
	static void move(int n, int x, int y) {
		String[] ABC = {"A���","B���","C���"};
		if(n>1) 
			move(n-1,x,6-x-y);
		
		System.out.println("����[" +n+ "]�� " +ABC[x-1]+ "��տ��� " +ABC[y-1]+ "������� �̵�");
		//ABC[x]�� �ƴ� [x-1], [y]�� �ƴ� [y-1]�� �����
		
		if(n>1)
			move(n-1,6-x-y,y);
		
	}

}
