import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class algo11866조세퍼스문제0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//n명의 사람
		int K = sc.nextInt();//k번째사람제거
		StringBuffer sb = new StringBuffer();
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1; i<=N; i++)
			q.add(i);
		
		sb.append("<");
		
		while(!q.isEmpty()) {
			int M = q.size()>=K ? K:K%q.size();
			
			while(M-->1) { //제거할 숫자가 나올때까지 뒤로 보내기
				int temp = q.poll();//poll : 큐의 front가 가리키는 값을 반환하고 삭제
				q.add(temp);
			}
			
			sb.append(q.poll()); //큐에서 제거한 값 출력
			
			if(!q.isEmpty())
				sb.append(", ");
			else
				sb.append(">");
		}
		System.out.println(sb.toString());
	}

}
