/*https://www.acmicpc.net/problem/2490
 * 첫째 줄부터 셋째 줄까지 한 줄에 하나씩 결과를  도는 A, 개는 B, 걸은 C, 윷은 D, 모는 E로 출력한다.
 */
import java.util.Scanner;

public class algo2490윷놀이 {
	//배 : 0, 등 : 1
	//도 : 배1 등3, 개 : 배2 등2, 걸 : 배3 등1, 윷 : 배4, 모 : 등4
	//도(A)->3, 개(B)->2, 걸(C)->1, 윷(D)->0, 모(E)->4

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] play = new int[4];
		int count=0;
		
		//String[] output= {"D","A","B","C","E"};//윷도개걸모
		
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
