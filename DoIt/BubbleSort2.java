//swap을 한 횟수가 0이면 (정렬이 다 되었으면) break;
import java.util.Scanner;

public class BubbleSort2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블정렬(버전2)");
		System.out.print("요솟수: ");
		int n = sc.nextInt();
		int[] x = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("x["+i+"]: ");
			x[i]=sc.nextInt();
		}
		
		bubbleSort(x,n);
		
		System.out.println("오름차순으로 정렬");
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
