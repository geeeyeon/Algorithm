import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("������������ �Է�");
		System.out.print("x[0] :");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"]:");
				x[i]=sc.nextInt();
			}while(x[i]<x[i-1]);
		}
		
		System.out.print("�˻��� �� : ");
		int key = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, key);//�迭 x���� Ű ���� key�� ��� �˻�
		
		if(idx<0) {
			System.out.println("�� ���� ��Ұ� ����");
			int injPoint=-idx-1;
			System.out.println("���� ����Ʈ�� -"+injPoint);
		}
		else
			System.out.println(key+"�� x["+idx+"]�� ����");
		
	}

}
