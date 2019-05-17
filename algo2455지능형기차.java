
/*https://www.acmicpc.net/problem/2455
 * 지능형 기차
 * 4개의 역에 대해 기차에서 내일 사람 수와 탄 사람 수가 주어졌을 때, 기차에 사람이 가장 많을 때의 사람 수 구하기
 * 각 역에서 내린 사람 수와 탄 사람 수가 빈칸을 사이에 두고 첫째 줄부터 넷째 줄까지 역 순서대로 한 줄에 하나씩 주어짐
 */
import java.util.Scanner;

public class algo2455지능형기차 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int max=0;
		for(int i=0; i<4; i++) {
			int out=sc.nextInt();
			int in=sc.nextInt();
			sum+=(in-out);
			if(sum>max)
				max=sum;
		}
		System.out.println(max);
	}

}
