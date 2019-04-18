import java.util.Scanner;

public class Recur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력 : ");
		int x = sc.nextInt();
		
		recur(x);
		System.out.println("-------------");
		recur1(x);
	}
	static void recur(int x) {
		if(x>0) {
			recur(x-1);
			System.out.println(x);
			recur(x-2);
		}
	}
	
	//재귀 제거
	static void recur1(int x) {
		IntStack s = new IntStack(x);
		while(true) {
			if(x>0) {
				s.push(x);
				x = x-1;
				continue;
			}
			if(s.isEmpty() != true) {
				x = s.pop();
				System.out.println(x);
				x = x-2;
				continue;
			}
			break;
		}
	}

}
