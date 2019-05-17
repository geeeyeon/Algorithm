/*https://www.acmicpc.net/problem/2740
 * 행렬곱셈
 * N*M크기의 행렬 A와 M*K크기의 행렬 B가 주어졌을 때, 두 행렬을 곱하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class algo2740행렬곱셈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aN = sc.nextInt();
		int aM = sc.nextInt();
		int arrA[][] = new int[aN][aM];
		
		//A행렬 입력
		for(int i=0; i<aN; i++) 
			for(int j=0; j<aM; j++) 
				arrA[i][j]=sc.nextInt();	
		
		
		int bM = sc.nextInt();
		int bK = sc.nextInt();
		int arrB[][] = new int[bM][bK];
		
		//B행렬 입력
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
