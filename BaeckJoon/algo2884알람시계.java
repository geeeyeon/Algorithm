/* https://www.acmicpc.net/problem/2884
알람시계
입력된 시간의 45분 전 시각을 출력하기*/
import java.util.*;

public class algo2884알람시계{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int HH = sc.nextInt();
        int MM = sc.nextInt();

        if(HH !=0){
            if(MM < 45){
                HH = HH-1;
                MM = (MM+60)-45;
            }
            else{
                MM = MM-45;
            }
        }else{
            if(MM < 45){
                HH = 23;
                MM = (MM+60)-45;
            }
            else{
                MM = MM-45;
            }            
        }
        System.out.println(HH+" "+MM);
    }
}