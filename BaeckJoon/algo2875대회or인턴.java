/*https://www.acmicpc.net/problem/2875
 * ��ȸ or ���� - �׸���˰�����
 */
import java.util.Scanner;

public class algo2875대회ȸor인턴 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//���л�
		int m = sc.nextInt();	//���л�
		int k = sc.nextInt();	//���Ͻ�
		
		int output=0;
		
		output = n/2<m ? n/2 : m;	//��2��1���� Ȯ��
		k -= n+m -output*3;	//3 = ��2+��1
		
		while(k>0) {
			k-=3;
			output--;
		}		
		
		System.out.println(output);				
	}	
	
}
