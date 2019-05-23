/*https://www.acmicpc.net/problem/4344
 * ����� �Ѱ���
 * ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ���
 */

import java.util.Scanner;

public class algo4344������Ѱ��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();	//�׽�Ʈ���̽� ����
		
		for(int i=0; i<c; i++) {
			int n = sc.nextInt();	//�л���
			
			int[] score=new int[n];
			double avg=0.0;
			int count = 0, total = 0;
			
			//���� �Է�
			for(int j=0; j<n; j++) {
				score[j]=sc.nextInt();
				total+=score[j];
			}
			
			//����� �Ѵ� �л� ��
			avg=(double)total/n;
			for(int j=0; j<n; j++) {
				if(score[j]>avg)
					count++;
			}
			
			double output = (double)count/n*100.0;
			System.out.printf("%.3f",output);
			System.out.println("%");
		}
	}

}
