//�迭�� ���ʺ��� �����ϱ�
import java.util.Scanner;
public class BubbleSortR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("��������");
		System.out.print("��ڼ� : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("x["+i+"] : ");
			a[i]=sc.nextInt();
		}
		
		bubbleSort(a,n);
		
		System.out.println("���� ��");
		for(int i=0; i<n; i++) {
			System.out.println("a["+i+"] : "+a[i]);
		}
	}
	static void bubbleSort(int[] a, int n) {
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(a[j]>a[j+1]) {
					int tmp = a[j+1];
					a[j+1] = a[j];
					a[j] = tmp;
				}
			}
		}
	}
}
