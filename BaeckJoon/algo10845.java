import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class algo10845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new LinkedList();
		int b=0;
		
		Scanner sc = new Scanner(System.in);
		int order = sc.nextInt();
		
		for(int i=0; i<order; i++) {
			String a = sc.next();
			if(a.equals("push")) {
				b=sc.nextInt();
				q.add(b);
			}else if(a.equals("front")) {
				System.out.println(q.isEmpty()?-1:q.peek());
			}else if(a.equals("back")) {
				System.out.println(q.isEmpty()?-1:b);
			}else if(a.equals("size")) {
				System.out.println(q.size());
			}else if(a.equals("pop")) {
				System.out.println(q.isEmpty()?-1:q.poll());
			}else if(q.equals("empty")) {
				System.out.println(q.isEmpty()?1:0);
			}
		}

	}

}
