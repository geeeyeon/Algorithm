/*https://www.acmicpc.net/problem/10799
 * �踷��� - Stack
 */
import java.util.Scanner;
import java.util.Stack;

public class algo10799�踷��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int output=0;
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)=='(' && input.charAt(i+1)==')') {//������
				output+=st.size();
				i++;
			}
			else if(input.charAt(i)==')') {
				st.pop();
				output++;
			}
			
			else {	
				st.push(input.charAt(i));
			}
		}
		System.out.println(output);
	}

}
