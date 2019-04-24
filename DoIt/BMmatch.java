import java.util.Scanner;

//Boyer-Moore������ ���ڿ� �˻�
public class BMmatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ؽ�Ʈ : ");
		String s1 = sc.next();
		
		System.out.print("���� : ");
		String s2 = sc.next();
		
		int idx = bmMatch(s1,s2);
		
		if(idx==-1)
			System.out.println("�ؽ�Ʈ�� ������ �����ϴ�.");
		else {
			int len=0;
			for(int i=0; i<idx; i++)
				len+=s1.substring(i, i+1).getBytes().length;
				//substring(��ġ1,��ġ2) : �ش� ���ڿ����� ��ġ1~��ġ2 ������ �ؽ��� �߶� �����ֱ�
			len+=s2.length();
			
			System.out.println((idx+1)+"��° ���ں��� ��ġ");
			System.out.println("�ؽ�Ʈ : "+s1);
			System.out.printf(String.format("���� : %%%ds\n", len), s2);
		}

	}
	
	static int bmMatch(String txt, String pat) {
		int pt;
		int pp;
		int txtLen = txt.length(); //txt�� ���� ����
		int patLen = pat.length(); //pat�� ���ڰ���
		int[] skip = new int[Character.MAX_VALUE+1]; //�ǳʶٱ� ǥ
		
		//�ǳʶٱ� ǥ �����
		for(pt = 0; pt<=Character.MAX_VALUE; pt++)
			skip[pt] = patLen;
		for(pt = 0; pt<patLen-1; pt++)
			skip[pat.charAt(pt)] = patLen -pt-1; //pt==patLen-1
		
		//�˻�
		while(pt<txtLen) {
			pp=patLen - 1;	//pat�� �� ����
			
			while(txt.charAt(pt) == pat.charAt(pp)) {
				if(pp==0)
					return pt; //�˻� ����
				pp--;
				pt--;
			}
			pt+=(skip[txt.charAt(pt)]>patLen-pp)?skip[txt.charAt(pt)]:patLen-pp;
		}
		return -1;
	}

}
