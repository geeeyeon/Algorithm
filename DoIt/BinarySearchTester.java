import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력");
		System.out.print("x[0] :");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"]:");
				x[i]=sc.nextInt();
			}while(x[i]<x[i-1]);
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, key);//배열 x에서 키 값이 key인 요소 검색
		
		if(idx<0) {
			System.out.println("그 값의 요소가 없음");
			int injPoint=-idx-1;
			System.out.println("삽입 포인트는 -"+injPoint);
		}
		else
			System.out.println(key+"는 x["+idx+"]에 있음");
		
	}

}
