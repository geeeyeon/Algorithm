//배열의 왼쪽부터 정렬하기
import java.util.Scanner;
public class BubbleSortR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("버블정렬");
		System.out.print("요솟수 : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("x["+i+"] : ");
			a[i]=sc.nextInt();
		}
		
		bubbleSort(a,n);
		
		System.out.println("정렬 후");
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
