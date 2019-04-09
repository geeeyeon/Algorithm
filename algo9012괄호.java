/* https://www.acmicpc.net/problem/9012
 * 괄호
 * VPS : 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열
 * 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다.
 * */
import java.util.Scanner;
import java.util.Stack;

public class algo9012괄호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		while(input>0) {
			String PS = sc.next();//괄호입력
			Stack<Character> st = new Stack<>();
			boolean VPS=true;
			
			for(int i=0; i<PS.length(); i++) {
				char tmp=PS.charAt(i);
				if(tmp=='(') {
					st.push(tmp);
				}else if(tmp==')') {
					if(st.isEmpty()) { //'('가 없으면
						VPS=false;		//false
						break;
					}
					else
						st.pop();//')'가 있으면 pop
				}
			}
			input--;
			if(!st.isEmpty()) VPS = false;//'('가 남아있으면false

			
			if(VPS) System.out.println("YES");
			else System.out.println("NO");			
		}
	}

}
