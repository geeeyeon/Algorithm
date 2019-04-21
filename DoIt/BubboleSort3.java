//정렬된 곳은 제외하고 정렬
import java.util.Scanner;

public class BubboleSort3 {

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
	
	static void swap(int[] x, int idx1, int idx2) {
		int t=x[idx1];
		x[idx1]=x[idx2];
		x[idx2]=t;
	}
	
	static void bubbleSort(int[] x,int n) {
		int k=0; //a[k]보다 앞쪽은 정렬을 마친 상태
		while(k<n-1) {
			int last = n-1; //마지막으로 요소를 교환한 위치
			for(int j=n-1; j>k; j--)
				if(x[j-1]>x[j]) {
					swap(x,j-1,j);
					last=j;
				}
			k=last;
		}
	}

}
