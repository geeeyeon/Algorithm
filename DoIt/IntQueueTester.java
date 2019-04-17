import java.util.Scanner;

public class IntQueueTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		IntQueue q = new IntQueue(64);
		
		while(true) {
			System.out.println("현재 데이터 수 : "+q.size()+" / "+q.capacity());
			System.out.print(	"(1)인큐	(2)디큐	(3)피크	(4)덤프	(0)종료");
			int menu = sc.nextInt();
			if(menu==0) break;
			
			int x;
			switch(menu) {
			case 1://인큐
				System.out.print("데이터 : ");;
				x=sc.nextInt();
				try {
					q.enque(x);
				}catch(IntQueue.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;
				
			case 2://디큐
				try {
					x=q.deque();
					System.out.println("디큐한 데이터는 "+x+"입니다.");
				}catch(IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비어있습니다.");
				}
				break;
				
			case 3://피크
				try {
					x=q.peek();
					System.out.println("피크한 데이터는 "+x+"입니다.");
				}catch(IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비어있습니다.");
				}
				break;
				
			case 4://덤프
				q.dump();
				break;
			}
		}
	}

}
