import java.util.Scanner;

//선형검색
public class SeqSearch {
	
	static int seqSearch(int[] a, int n, int key) {
		int i=0;
		while(true) {
			if(i==n) return -1;//검색 실패
			if(a[i]==key) return i;
			i++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] x=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] :");
			x[i] = sc.nextInt();//배열에 요소들 넣기
		}
		
		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		int idx = seqSearch(x,num,ky);//배열 요소에서 검색하기
		
		if(idx==-1)//검색실패
			System.out.println("그 값의 요소가 없음");
		else
			System.out.println(ky+"는 x["+idx+"]에 있습니다");
	}

}
