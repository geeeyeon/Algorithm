/*https://www.acmicpc.net/problem/2740
 * ��İ���
 * N*Mũ���� ��� A�� M*Kũ���� ��� B�� �־����� ��, �� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;

public class algo2740��İ��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aN = sc.nextInt();
		int aM = sc.nextInt();
		int arrA[][] = new int[aN][aM];
		
		//A��� �Է�
		for(int i=0; i<aN; i++) 
			for(int j=0; j<aM; j++) 
				arrA[i][j]=sc.nextInt();	
		
		
		int bM = sc.nextInt();
		int bK = sc.nextInt();
		int arrB[][] = new int[bM][bK];
		
		//B��� �Է�
		for(int i=0; i<bM; i++) 
			for(int j=0; j<bK; j++)
				arrB[i][j]=sc.nextInt();

			
		int[][] arr = new int[aN][bK];
		for(int i=0; i<aN; i++) {
			for(int j=0; j<bK; j++) {
				int sum=0;
				for(int k=0; k<aM; k++) 
					sum+=arrA[i][k]*arrB[k][j];
				System.out.print(sum+" ");
			}
			System.out.println();
		}
		
	}

}
