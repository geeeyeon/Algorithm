import java.util.Scanner;

//�����˻�
public class SeqSearch {
	
	static int seqSearch(int[] a, int n, int key) {
		int i=0;
		while(true) {
			if(i==n) return -1;//�˻� ����
			if(a[i]==key) return i;
			i++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] x=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] :");
			x[i] = sc.nextInt();//�迭�� ��ҵ� �ֱ�
		}
		
		System.out.print("�˻��� �� : ");
		int ky = sc.nextInt();
		int idx = seqSearch(x,num,ky);//�迭 ��ҿ��� �˻��ϱ�
		
		if(idx==-1)//�˻�����
			System.out.println("�� ���� ��Ұ� ����");
		else
			System.out.println(ky+"�� x["+idx+"]�� �ֽ��ϴ�");
	}

}
