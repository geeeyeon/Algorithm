import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.print("원반 개수 : ");
		int n = sc.nextInt();
		
		move(n,1,3);
	}
	//기둥의 번호를 1번, 2번, 3번이라고 할 때 기둥 번호의 합은 6
	//시작기둥은 x, 목표기둥은 y라고 할 때, 중간기둥은 6-x-y이다.
	static void move(int n, int x, int y) {
		if(n > 1)
			move(n-1, x, 6-x-y);
		System.out.println("원반["+n+"]을"+x+"기둥에서 "+y+"기둥으로 옮김");
		
		if(n>1)
			move(n-1, 6-x-y, y);
	}

}
