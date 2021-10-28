/* https://www.acmicpc.net/problem/2292
 * 벌집
 * 입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력
 * */
import java.util.Scanner;

public class algo2292 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt();//검색할 벌집번호
		int result;
		int room=1;//현재 방
		int sum=1;//전 범위의 방
		
		while(true) {
			sum+=6*(room-1);
			if(sum>=search) {
				result=room;
				break;
			}
			room++;			
		}
		System.out.println(result);	
		
	}
}
