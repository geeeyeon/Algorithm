/*https://www.acmicpc.net/problem/2875
 * 대회 or 인턴 - 그리디알고리즘
 */
import java.util.Scanner;

public class algo2875대회or인턴 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//여학생
		int m = sc.nextInt();	//남학생
		int k = sc.nextInt();	//인턴쉽
		
		int output=0;
		
		output = n/2<m ? n/2 : m;	//여2남1비율 확인
		k -= n+m -output*3;	//3 = 여2+남1
		
		while(k>0) {
			k-=3;
			output--;
		}		
		
		System.out.println(output);				
	}	
	
}
