import java.util.Scanner;

//�ؽ�Ʈ�� ���� ������ �ε����� ��ȯ
public class BFmatchRev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ؽ�Ʈ : ");
		String s1 = sc.next();
		
		System.out.print("���� : ");
		String s2 = sc.next();
		
		int idx = bfMatchRev(s1,s2);
		
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
		if (pp < 0) // �˻�����
			return pt + 1;
		return -1; // �˻�����
	}

}
