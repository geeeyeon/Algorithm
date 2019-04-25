import java.util.Scanner;

public class KMPmatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("텍스트 : ");
		String s1 = sc.next();
		
		System.out.print("패턴 : ");
		String s2 = sc.next();
		
		int idx = kmpMatch(s1,s2);
		
		if(idx==-1)
			System.out.println("텍스트에 패턴이 없습니다.");
		else {
			int len=0;
			for(int i=0; i<idx; i++)
				len+=s1.substring(i, i+1).getBytes().length;
				//substring(위치1,위치2) : 해당 문자열에서 위치1~위치2 사이의 텍스만 잘라서 보여주기
			len+=s2.length();
			
			System.out.println((idx+1)+"번째 문자부터 일치");
			System.out.println("텍스트 : "+s1);
			System.out.printf(String.format("패턴 : %%%ds\n", len), s2);
		}
	}
	
	static int kmpMatch(String txt, String pat) {
		int pt = 1;	//txt커서
		int pp = 0;	//pat커서
		int[] skip = new int[pat.length()+1]; //건너뛰기 표
		
		//건너뛰기 표 만들기
		skip[pt]=0;
		while(pt!=pat.length()) {
			if(pat.charAt(pt)==pat.charAt(pp))
				skip[++pt]=++pp;
			else if(pp==0)
				skip[++pt]=pp;
			else
				pp=skip[pp];
		}
		
		//검색
		pt = pp = 0;
		while(pt!=txt.length() && pp!=pat.length()) {
			if(txt.charAt(pt)==pat.charAt(pp)) {
				pt++;
				pp++;
			}else if(pp==0)
				pt++;
			else
				pp=skip[pp];
		}
		
		if(pp==pat.length()) //pt-pp반환
			return pt-pp;
		return -1; //검색실패
		
	}

}
