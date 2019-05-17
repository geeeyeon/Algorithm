/*https://www.acmicpc.net/problem/1547
 * 공
 * 첫째 줄에 공이 들어있는 컵의 번호를 출력한다. 공이 사라져서 컵 밑에 없는 경우에는 -1을 출력한다.
 */
import java.util.Scanner;

public class algo1547공 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] cup = {1,0,0}; //항상 1번컵에 공이 있는 것으로 시작
		
		while(m-->0) {
			int a = sc.nextInt()-1;//바꿀 컵 위치(배열이기때문에 -1)
			int b = sc.nextInt()-1;//바꿀 컵 위치
			
			int tmp = cup[a];
			cup[a] = cup[b];
			cup[b] = tmp;
		}
		for(int i=0; i<cup.length; i++) {
			if(cup[i]==1)//컵에 공이 들어있다
				System.out.println(i+1);
		}
	}

}
