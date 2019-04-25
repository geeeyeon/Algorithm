import java.util.Scanner;

public class Partition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[������]�迭�� ������.");
		System.out.print("��ڼ�: ");
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
		int pl=0;	//����Ŀ��
		int pr=n-1;	//������Ŀ��
		int a=x[n/2];//pivot
		
		do {
			while(x[pl]< a) pl++;//���ʺ��� pivot���� ū��ã��
			while(x[pr]> a) pr--;//�����ʺ��� pivot���� ������ã��
			if(pl<=pr)
				swap(x,pl++,pr--);
		}while(pl<=pr);
		
		System.out.println("�ǹ��� ���� "+a+"�Դϴ�.");
		
		System.out.println("�ǹ� ������ �׷�");
		for(int i=0; i<=pl-1; i++)	//x[0]~x[pl-1]
			System.out.print(x[i]+" ");
		System.out.println();
		
		if(pl>pr+1) {
			System.out.println("�ǹ��� ��ġ�ϴ� �׷�");
			for(int i=pr+1;i<=pl-1;i++)	//x[pr+1]~x[pl-1]
				System.out.print(x[i]+" ");
			System.out.println();
		}
		
		System.out.println("�ǹ� �̻��� �׷�");
		for(int i=pr+1; i<n; i++)	//a[pr+1]~a[n-1]
			System.out.print(x[i]+" ");
		System.out.println();
	}

}
