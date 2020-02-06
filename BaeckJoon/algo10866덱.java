/* https://www.acmicpc.net/problem/10866
 * ������ �����ϴ� ��(Deque)�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * */
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class algo10866�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();//��ɾ�
		
		Deque<Integer> deque = new LinkedList<>();		
		
		while(input-->0) {
			String order = sc.next();
			
			if(order.equals("push_front")) {
				int x = sc.nextInt();
				deque.addFirst(x);
			}
			
			else if(order.equals("push_back")) {
				int x = sc.nextInt();
				deque.addLast(x);
			}
			
			else if(order.equals("pop_front")) {
				System.out.println(deque.isEmpty()? -1:deque.removeFirst());
			}
			
			else if(order.equals("pop_back")) {
				System.out.println(deque.isEmpty()? -1:deque.removeLast());
			}
			
			else if(order.equals("size")) {
				System.out.println(deque.size());
			}
			
			else if(order.equals("empty")) {
				System.out.println(deque.isEmpty()? 1:0);
			}
			
			else if(order.equals("front")) {
				System.out.println(deque.isEmpty()? -1:deque.getFirst());
			}
			
			else if(order.equals("back")) {
				System.out.println(deque.isEmpty()? -1:deque.getLast());
			}
		}
	}

}
