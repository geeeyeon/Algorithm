import java.util.Scanner;

//Boyer-Moore법으로 문자열 검색
public class BMmatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("텍스트 : ");
		String s1 = sc.next();
		
		System.out.print("패턴 : ");
		String s2 = sc.next();
		
		int idx = bmMatch(s1,s2);
		
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
	
	static int bmMatch(String txt, String pat) {
		int pt;
		int pp;
		int txtLen = txt.length(); //txt의 문자 개수
		int patLen = pat.length(); //pat의 문자개수
		int[] skip = new int[Character.MAX_VALUE+1]; //건너뛰기 표
		
		//건너뛰기 표 만들기
		for(pt = 0; pt<=Character.MAX_VALUE; pt++)
			skip[pt] = patLen;
		for(pt = 0; pt<patLen-1; pt++)
			skip[pat.charAt(pt)] = patLen -pt-1; //pt==patLen-1
		
		//검색
		while(pt<txtLen) {
			pp=patLen - 1;	//pat의 끝 문자
			
			while(txt.charAt(pt) == pat.charAt(pp)) {
				if(pp==0)
					return pt; //검색 성공
				pp--;
				pt--;
			}
			pt+=(skip[txt.charAt(pt)]>patLen-pp)?skip[txt.charAt(pt)]:patLen-pp;
		}
		return -1;
	}

}
