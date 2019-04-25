//���ĵ� ���� �����ϰ� ����
import java.util.Scanner;

public class BubboleSort3 {

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
	
	static void swap(int[] x, int idx1, int idx2) {
		int t=x[idx1];
		x[idx1]=x[idx2];
		x[idx2]=t;
	}
	
	static void bubbleSort(int[] x,int n) {
		int k=0; //a[k]���� ������ ������ ��ģ ����
		while(k<n-1) {
			int last = n-1; //���������� ��Ҹ� ��ȯ�� ��ġ
			for(int j=n-1; j>k; j--)
				if(x[j-1]>x[j]) {
					swap(x,j-1,j);
					last=j;
				}
			k=last;
		}
	}

}
