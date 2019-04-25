import java.util.Scanner;

//텍스트의 가장 뒤쪽의 인덱스를 반환
public class BFmatchRev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("텍스트 : ");
		String s1 = sc.next();
		
		System.out.print("패턴 : ");
		String s2 = sc.next();
		
		int idx = bfMatchRev(s1,s2);
		
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
	
	static int bfMatchRev(String txt, String pat) {
		int pt = txt.length()-1;
		int pp = pat.length()-1;
		
		while(pt >= 0 && pp >= 0) {
			if(txt.charAt(pt)==pat.charAt(pp)) {
				pt--;
				pp--;
			}else {
				pt = pt + (pat.length() - pp) - 2;
				pp = pat.length() - 1;
			}
		}
		if (pp < 0) // 검색성공
			return pt + 1;
		return -1; // 검색실패
	}

}
