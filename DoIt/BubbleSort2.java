//swap�� �� Ƚ���� 0�̸� (������ �� �Ǿ�����) break;
import java.util.Scanner;

public class BubbleSort2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������(����2)");
		System.out.print("��ڼ�: ");
		int n = sc.nextInt();
		int[] x = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("x["+i+"]: ");
			x[i]=sc.nextInt();
		}
		
		bubbleSort(x,n);
		
		System.out.println("������������ ����");
		for(int i=0; i<n; i++)
			System.out.println("x["+i+"]="+x[i]);
	}
	
	static void bubbleSort(int[] x, int n) {
		for(int i=0; i<n-1; i++) {
			int exchg=0;
			for(int j=n-1; j>i; j--)
				if(x[j-1]>x[j]) {
					swap(x,j-1,j);
					exchg++;
				}
			if(exchg==0) break;
		}
	}
	
	static void swap(int[] x, int idx1, int idx2) {
		int t=x[idx1];
		x[idx1]=x[idx2];
		x[idx2]=t;
	}

}
