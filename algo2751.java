/* https://www.acmicpc.net/problem/2751
 * 수 정렬하기2
 * 수의 개수 N을 입력하고
 * 입력된 수들을 오름차순으로 정렬하기
 * */
//버블정렬로 하면 시간초과
//시간을 더 줄일수 있는 방법?
import java.util.Scanner;

public class algo2751 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		for(int i=0; i<N; i++) {
			input[i]=sc.nextInt();
		}
		
		quickSort(input,0,N-1);
		
		for(int i=0; i<N; i++) {
			System.out.println(input[i]);
		}
	}
	static void swap(int[] input, int input1, int input2) {
		int tmp = input[input1];
		input[input1] = input[input2];
		input[input2] = tmp;
	}
	static void quickSort(int[] input, int left, int right) {
		int pl = left;
		int pr = right;
		int pivot = input[(pl+pr)/2];
		
		do {
			while (input[pl]<pivot) pl++;
			while (input[pr]>pivot) pr--;
			if(pl <= pr)
				swap(input, pl++, pr--);
		}while(pl<=pr);
		
		if(left<pr) quickSort(input, left, pr);
		if(pl<right) quickSort(input, pl, right);
	}

}
