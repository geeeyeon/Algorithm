import java.util.Scanner;

//117p 연습문제
//요솟수가 n 인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장하고, 일치한 요솟수를 반환하는 메서드 작성
public class SearchIdx {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count=0;
		for(int i=0; i<n; i++) {
			int j=0;
			if(a[i]==key) {
				idx[j]=n;
				j++;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //요솟수 입력
		int[] a = new int[n];//요소들 저장
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}//배열에 요소들 넣기
		
		System.out.print("검색할 key 값: ");
		int key = sc.nextInt();
		
		int[] idx = new int[n];
		int count=searchIdx(a,n,key,idx);
		System.out.println(count);
		
		
	}

}
