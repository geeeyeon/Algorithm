import java.util.Scanner;

public class IndexOfTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("텍스트 : ");
		String s1 = sc.next();
		
		System.out.print("패턴 : ");
		String s2 = sc.next();
		
		int idx1 = s1.indexOf(s2);		//문자열 s1에서 s2를 검색
		int idx2 = s1.lastIndexOf(s2); 	//문자열 s1에서 s2를 검색(가장 마지막 위치의 문자열 검색) 
		
		if(idx1==-1)
			System.out.println("텍스트 안에 패턴이 없습니다.");
		else {
			//찾아낸 문자열의 바로 앞까지의 문자 개수
			int len1=0;
			for(int i=0; i<idx1; i++)
				len1 += s1.substring(i,i+1).getBytes().length;
				//반각문자(영문,숫자,기호)는 1바이트의 바이트배열로, 전각문자(한글,한자)는 3바이트의 바이트 배열로 바꾸어 출력
			len1+=s2.length();
			
			int len2=0;
			for(int i=0; i<idx2; i++)
				len2+=s1.substring(i,i+1).getBytes().length;
			len2+=s2.length();
			
			System.out.println("텍스트 : "+s1);
			System.out.printf(String.format("패턴  : %%%ds\n",len1), s2);
			
			System.out.println("텍스트 : "+s1);
			System.out.printf(String.format("패턴  : %%%ds\n", len2), s2);
		}
	}

}
