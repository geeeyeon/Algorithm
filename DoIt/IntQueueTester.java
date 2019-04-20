import java.util.Scanner;

public class IntQueueTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		IntQueue q = new IntQueue(64);
		
		while(true) {
			System.out.println("���� ������ �� : "+q.size()+" / "+q.capacity());
			System.out.print(	"(1)��ť	(2)��ť	(3)��ũ	(4)����	(0)����");
			int menu = sc.nextInt();
			if(menu==0) break;
			
			int x;
			switch(menu) {
			case 1://��ť
				System.out.print("������ : ");;
				x=sc.nextInt();
				try {
					q.enque(x);
				}catch(IntQueue.OverflowIntQueueException e) {
					System.out.println("ť�� ���� á���ϴ�.");
				}
				break;
				
			case 2://��ť
				try {
					x=q.deque();
					System.out.println("��ť�� �����ʹ� "+x+"�Դϴ�.");
				}catch(IntQueue.EmptyIntQueueException e) {
					System.out.println("ť�� ����ֽ��ϴ�.");
				}
				break;
				
			case 3://��ũ
				try {
					x=q.peek();
					System.out.println("��ũ�� �����ʹ� "+x+"�Դϴ�.");
				}catch(IntQueue.EmptyIntQueueException e) {
					System.out.println("ť�� ����ֽ��ϴ�.");
				}
				break;
				
			case 4://����
				q.dump();
				break;
			}
		}
	}

}
