/*https://www.acmicpc.net/problem/2562
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
*/

import java.util.*;

public class algo2562{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int num[] = new int[9];
        int max = 0;
        int maxnum = 0;
        for(int i=0; i<9; i++){
            num[i] = sc.nextInt();
            if(num[i]>max){
                max = num[i];
                maxnum = i;
            }
        }
        System.out.println(max);
        System.out.println(maxnum+1);

    }
}