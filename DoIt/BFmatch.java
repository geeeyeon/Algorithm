import java.util.Scanner;

public class BFmatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("텍스트 : ");
		String s1 = sc.next();
		
		System.out.print("패턴 : ");
		String s2 = sc.next();
		
		int idx = bfMatch(s1,s2);
		
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
	
	static int bfMatch(String txt, String pat) {
		int pt = 0;//txt커서
		int pp = 0;//patern커서
		
		while(pt != txt.length() && pp != pat.length()) {
			if(txt.charAt(pt)==pat.charAt(pp)) {
				pt++;
				pp++;
			}else {
				pt = pt-pp+1;
				pp = 0;
			}
		}
		if(pp==pat.length())//검색성공
			return pt-pp;
		return -1;
	}

}
