import java.util.Scanner;

public class QuickSort1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("퀵정렬(과정출력버전)");
		System.out.print("요솟수: ");
		
		int n=sc.nextInt();
		int[] x = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("x["+i+"]: ");
			x[i]=sc.nextInt();
		}
		
		quickSort(x,0,n-1);

		for(int i=0; i<n; i++)
			System.out.println("x["+i+"] : "+x[i]);
	}
	
	static void swap(int[] x, int idx1, int idx2) {
		int t=x[idx1];
		x[idx1]=x[idx2];
		x[idx2]=t;
	}
	
	static void quickSort(int[] x, int left, int right) {
		int pl=left;
		int pr=right;
		int pivot=x[(pl+pr)/2];
		
		System.out.printf("x[%d]~x[%d] : {",left,right);
		for(int i=left; i<right; i++)
			System.out.printf("%d , ", x[i]);
		System.out.printf("%d}\n", x[right]);
		
		do {
			while(x[pl]<pivot) pl++;
			while(x[pr]>pivot) pr--;
			if(pl<=pr)
				swap(x,pl++,pr--);
		}while(pl<=pr);
		
		if(left<pr) quickSort(x,left,pr);
		if(pl<right)quickSort(x,pl,right);
	}
}
