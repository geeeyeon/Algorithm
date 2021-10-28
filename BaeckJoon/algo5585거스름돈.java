/*https://www.acmicpc.net/problem/5585
 * �Ž����� - �׸���˰���
 */

import java.util.Scanner;

public class algo5585�Ž����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int output = 0;
		int money = 1000-input;
		int[] coin = {500,100,50,10,5,1};
		
		for(int i=0; i<coin.length; i++) {
			if(money==0) break;
			
			output += money/coin[i];
			money = money%coin[i];
			
			
		}
		
		System.out.println(output);
	}

}
