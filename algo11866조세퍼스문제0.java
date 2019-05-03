import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class algo11866�����۽�����0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//n���� ���
		int K = sc.nextInt();//k��°�������
		StringBuffer sb = new StringBuffer();
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1; i<=N; i++)
			q.add(i);
		
		sb.append("<");
		
		while(!q.isEmpty()) {
			int M = q.size()>=K ? K:K%q.size();
			
			while(M-->1) { //������ ���ڰ� ���ö����� �ڷ� ������
				int temp = q.poll();//poll : ť�� front�� ����Ű�� ���� ��ȯ�ϰ� ����
				q.add(temp);
			}
			
			sb.append(q.poll()); //ť���� ������ �� ���
			
			if(!q.isEmpty())
				sb.append(", ");
			else
				sb.append(">");
		}
		System.out.println(sb.toString());
	}

}
