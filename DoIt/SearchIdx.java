import java.util.Scanner;

//117p ��������
//��ڼ��� n �� �迭 a���� key�� ��ġ�ϴ� ��� ����� �ε����� �迭 idx�� �� �պ��� ������� �����ϰ�, ��ġ�� ��ڼ��� ��ȯ�ϴ� �޼��� �ۼ�
public class SearchIdx {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count=0;
		for(int i=0; i<n; i++) {
			int j=0;
			if(a[i]==key) {
				idx[j]=n;
				j++;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //��ڼ� �Է�
		int[] a = new int[n];//��ҵ� ����
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}//�迭�� ��ҵ� �ֱ�
		
		System.out.print("�˻��� key ��: ");
		int key = sc.nextInt();
		
		int[] idx = new int[n];
		int count=searchIdx(a,n,key,idx);
		System.out.println(count);
		
		
	}

}
