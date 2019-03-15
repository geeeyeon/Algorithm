/*
 * 프로그래머스 12969
 * https://programmers.co.kr/learn/courses/30/lessons/12969?language=java
 * 직사각형 별찍기
 * 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력
 * 
 */
import java.util.Scanner;
public class algo12969 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i=0; i<b; i++){
            for(int j=0; j<a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
