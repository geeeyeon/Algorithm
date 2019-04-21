//배열의 오른쪽부터 정렬하기
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블정렬(버전1)");
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
			for(int j=n-1; j>i; j--) {
				if(x[j-1]>x[j]) {
					int tmp = x[j];
					x[j]=x[j-1];
					x[j-1]=tmp;
				}
			}
		}
	}

}
