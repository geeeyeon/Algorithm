import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÄüÁ¤·Ä");
		System.out.print("¿ä¼Ú¼ö: ");
		
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
		
		do {
			while(x[pl]<pivot)pl++;
			while(x[pr]>pivot)pr--;
			if(pl<=pr)
				swap(x,pl++,pr--);
		}while(pl<=pr);
		
		if(left<pr) quickSort(x,left,pr);
		if(pl<right) quickSort(x,pl,right);
	}

}
