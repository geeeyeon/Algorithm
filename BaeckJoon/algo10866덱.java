/* https://www.acmicpc.net/problem/10866
 * 정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * */
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class algo10866덱 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();//명령어
		
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
