/*https://www.acmicpc.net/problem/4344
 * 평균은 넘겠지
 * 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력
 */

import java.util.Scanner;

public class algo4344평균은넘겠지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();	//테스트케이스 개수
		
		for(int i=0; i<c; i++) {
			int n = sc.nextInt();	//학생수
			
			int[] score=new int[n];
			double avg=0.0;
			int count = 0, total = 0;
			
			//점수 입력
			for(int j=0; j<n; j++) {
				score[j]=sc.nextInt();
				total+=score[j];
			}
			
			//평균을 넘는 학생 수
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
