/*https://www.acmicpc.net/problem/11004
 * A�� �������� ��, �տ������� K��° �ִ� ���� ����Ѵ�.
 * Scanner���->�ð��ʰ�
 * List���->4924ms
 * Arrays.sort()�̿�->�ð��ʰ�
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo11004K��°�� {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmp = br.readLine().split(" ");
		int N=Integer.parseInt(tmp[0]);
		int K=Integer.parseInt(tmp[1]);
		
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++)
			arr[i]=Integer.parseInt(st.nextToken());
		
		sort(arr,0,N-1);
		System.out.println(arr[K-1]);
	}
	
	static void sort(int[] arr, int left, int right) {
		int pl = left;
		int pr = right;
		int x=arr[(pl+pr)/2];
		
		do {
			while(arr[pl]<x) pl++;
			while(arr[pr]>x) pr--;
			if(pl<=pr)
				swap(arr,pl++,pr--);
		}while(pl<=pr);
		if(left<pr) sort(arr,left,pr);
		if(pl<right) sort(arr,pl,right);
	}
	static void swap(int[] arr, int idx1, int idx2) {
		int t=arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = t;
	}
}

