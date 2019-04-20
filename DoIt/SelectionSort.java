import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������");
		System.out.print("��ڼ�: ");
		int n = sc.nextInt();
		int[] x = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("x["+i+"]: ");
			x[i]=sc.nextInt();
		}
		
		selectionSort(x,n);
		
		System.out.println("������������ ����");
		for(int i=0; i<n; i++)
			System.out.println("x["+i+"]="+x[i]);
	}
	
	static void swap(int[] x, int idx1, int idx2) {
		int t=x[idx1];
		x[idx1]=x[idx2];
		x[idx2]=t;
	}
	
	static void selectionSort(int[] x, int n) {
		for(int i=0; i<n-1; i++) {
			int min=i;
			for(int j=i+1; j<n; j++)
				if(x[j]<x[min])
					min=j;
			swap(x,i,min);
		}
	}

}
