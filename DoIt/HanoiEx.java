//하노이 탑 문제 바꾸기
//기둥을 번호가 아닌 A기둥,B기둥,C기둥으로 표현하기
import java.util.Scanner;

public class HanoiEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("하노이의 탑");
		System.out.print("원반의 갯수를 입력하세요 : ");
		int n = sc.nextInt();
		
		move(n,1,3);
	}
	
	static void move(int n, int x, int y) {
		String[] ABC = {"A기둥","B기둥","C기둥"};
		if(n>1) 
			move(n-1,x,6-x-y);
		
		System.out.println("원반[" +n+ "]을 " +ABC[x-1]+ "기둥에서 " +ABC[y-1]+ "기둥으로 이동");
		//ABC[x]가 아닌 [x-1], [y]가 아닌 [y-1]로 써야함
		
		if(n>1)
			move(n-1,6-x-y,y);
		
	}

}
