/* https://www.acmicpc.net/problem/9012
 * ��ȣ
 * VPS : ��ȣ�� ����� �ٸ��� ������ ���ڿ��� �ùٸ� ��ȣ ���ڿ�
 * �Է����� �־��� ��ȣ ���ڿ��� VPS ���� �ƴ����� �Ǵ��ؼ� �� ����� YES �� NO �� ��Ÿ����� �Ѵ�.
 * */
import java.util.Scanner;
import java.util.Stack;

public class algo9012��ȣ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		while(input>0) {
			String PS = sc.next();//��ȣ�Է�
			Stack<Character> st = new Stack<>();
			boolean VPS=true;
			
			for(int i=0; i<PS.length(); i++) {
				char tmp=PS.charAt(i);
				if(tmp=='(') {
					st.push(tmp);
				}else if(tmp==')') {
					if(st.isEmpty()) { //'('�� ������
						VPS=false;		//false
						break;
					}
					else
						st.pop();//')'�� ������ pop
				}
			}
			input--;
			if(!st.isEmpty()) VPS = false;//'('�� ����������false

			
			if(VPS) System.out.println("YES");
			else System.out.println("NO");			
		}
	}

}
