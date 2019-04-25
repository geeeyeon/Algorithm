import java.util.Scanner;

import merge.IntStack;

public class QuickSort2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÄüÁ¤·Ä(ºñÀç±Í ¹öÀü)");
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
		IntStack lstack = new IntStack(right - left + 1);
		IntStack rstack = new IntStack(right - left + 1);
		
		lstack.push(left);
		rstack.push(right);
		
		System.out.println("<lstack>");
		lstack.dump();
		System.out.println("<rstack>");
		rstack.dump();
		
		while(lstack.isEmpty() != true) {
			int pl = left = lstack.pop();
			int pr = right = rstack.pop();
			int pivot = x[(left+right)/2];
			
			do {
				while(x[pl]<pivot) pl++;
				while(x[pr]>pivot) pr--;
				if(pl<=pr)
					swap(x,pl++,pr--);
			}while(pl<=pr);
			
			if(left<pr) {
				lstack.push(left);
				rstack.push(pr);
				System.out.println("<lstack>");
				lstack.dump();
				System.out.println("<rstack>");
				rstack.dump();
				
			}
			if(pl<right) {
				lstack.push(pl);
				rstack.push(right);
				System.out.println("<lstack>");
				lstack.dump();
				System.out.println("<rstack>");
				rstack.dump();
			}
		}

	}

}
