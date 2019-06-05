/*https://www.acmicpc.net/problem/10610
 * 30 - 그리디알고리즘
 */

import java.util.Arrays;
import java.util.Scanner;

public class algo10610 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int[] num = new int[input.length()];
		int sum=0;
		boolean zero = false;
		
		for(int i=0; i<num.length; i++) { 
			num[i]=input.charAt(i)-'0';
			sum+=num[i];
			if(num[i]==0) {
				zero = true;
			}
		}
		
		if(sum%3!=0 | zero == false) { //30으로 나누어 떨어지는지 검사
			System.out.println("-1");
		}
		else {
			Arrays.sort(num);
			for(int i=num.length-1; i>=0; i--) {
				System.out.print(num[i]);
			}
		}	
		
	}

}
