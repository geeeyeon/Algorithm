/* https://www.acmicpc.net/problem/2747
 * �Ǻ���ġ��
 * memoization���� �ٽ�Ǯ��
 * */

import java.util.Scanner;

public class algo2747�Ǻ���ġ�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();//0~�Է� ������
		
		int output = fibo(input);
		System.out.println(output);
	}
	static int fibo(int input) {
		if(input<=1)
			return input;
		else
			return fibo(input-2)+fibo(input-1);
	}

}
