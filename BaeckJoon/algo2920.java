/* https://www.acmicpc.net/problem/2920
 * ����
 * �������� c d e f g a b C, �� 8�� ������ �̷�����ִ�. �� �������� 8�� ���� ������ ���� ���ڷ� �ٲپ� ǥ���Ѵ�.
 * 1���� 8���� ���ʴ�� �����Ѵٸ� ascending, 
 * 8���� 1���� ���ʴ�� �����Ѵٸ� descending, �� �� �ƴ϶�� mixed 
 * */
import java.util.Scanner;
public class algo2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] input = new int[8];
		for(int i=0; i<8; i++) {
			input[i]=sc.nextInt();
		}
		String result="";
		for(int i=0; i<input.length-1; i++) {
			if(input[i]==input[i+1]+1)
				result="descending"; //���⼭ �ٷ� ����Ʈ�ع����� 8�����
			else if(input[i]==input[i+1]-1)
				result="ascending";
			else
				result="mixed";
			break;
		}
		
		System.out.println(result);
		
	}

}
