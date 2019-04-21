import java.util.Scanner;

public class Partition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[퀵정렬]배열을 나눈다.");
		System.out.print("요솟수: ");
		int n= sc.nextInt();
		int[] x = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("x["+i+"] : ");
			x[i]=sc.nextInt();
		}
		partition(x,n);
	}
	static void swap(int[] x, int idx1, int idx2) {
		int t=x[idx1];
		x[idx1]=x[idx2];
		x[idx2]=t;
	}
	static void partition(int[]x, int n) {
		int pl=0;	//왼쪽커서
		int pr=n-1;	//오늘쪽커서
		int a=x[n/2];//pivot
		
		do {
			while(x[pl]< a) pl++;//왼쪽부터 pivot보다 큰값찾기
			while(x[pr]> a) pr--;//오른쪽부터 pivot보다 작은값찾기
			if(pl<=pr)
				swap(x,pl++,pr--);
		}while(pl<=pr);
		
		System.out.println("피벗의 값은 "+a+"입니다.");
		
		System.out.println("피벗 이하의 그룹");
		for(int i=0; i<=pl-1; i++)	//x[0]~x[pl-1]
			System.out.print(x[i]+" ");
		System.out.println();
		
		if(pl>pr+1) {
			System.out.println("피벗과 일치하는 그룹");
			for(int i=pr+1;i<=pl-1;i++)	//x[pr+1]~x[pl-1]
				System.out.print(x[i]+" ");
			System.out.println();
		}
		
		System.out.println("피벗 이상의 그룹");
		for(int i=pr+1; i<n; i++)	//a[pr+1]~a[n-1]
			System.out.print(x[i]+" ");
		System.out.println();
	}

}
