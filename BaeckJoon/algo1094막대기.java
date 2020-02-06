
/*https://www.acmicpc.net/problem/1094
 * 가지고 있는 막대 중 길이가 가장 짧은 것을 절반으로 자른다.
 * 막대의 길이의 합이 X보다 크거나 같다면, 위에서 자른 막대의 절반 중 하나를 버린다.
 * 몇 개의 막대를 풀로 붙여서 Xcm를 만들 수 있는지 출력한다.
 */
import java.util.Scanner;

public class algo1094막대기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();//가지고싶은 막대기
		int stick = 64;
		int count=0;
		while(stick>0) {			
			if(stick>x) {
				stick=stick/2; //막대를 반으로 자른다
			}else {
				x-=stick;
				count++;
			}
		}
		System.out.println(count);		
	}

}
