/*https://www.acmicpc.net/problem/2490
 * ù° �ٺ��� ��° �ٱ��� �� �ٿ� �ϳ��� �����  ���� A, ���� B, ���� C, ���� D, ��� E�� ����Ѵ�.
 */
import java.util.Scanner;

public class algo2490������ {
	//�� : 0, �� : 1
	//�� : ��1 ��3, �� : ��2 ��2, �� : ��3 ��1, �� : ��4, �� : ��4
	//��(A)->3, ��(B)->2, ��(C)->1, ��(D)->0, ��(E)->4

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] play = new int[4];
		int count=0;
		
		//String[] output= {"D","A","B","C","E"};//�������ɸ�
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<play.length; j++) {
				play[j]=sc.nextInt();
				count+=play[j];
			
			}
				switch(count) {
				case 0:
					System.out.println("D");
					break;
				case 1:
					System.out.println("C");
					break;
				case 2:
					System.out.println("B");
					break;
				case 3:
					System.out.println("A");
					break;
				case 4:
					System.out.println("E");
					break;
				}
				count=0;
			
		}
		
	}
	
}
