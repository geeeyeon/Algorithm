import java.util.*;

public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
       
       for(int i=1; i<=T; i++){
           int a = sc.nextInt();
           int b = sc.nextInt();
           int sum = a+b;
           System.out.print("Case #"+i+": "+sum);
       }
    }
}