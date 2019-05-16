/*https://www.acmicpc.net/problem/11004
 * A�� �������� ��, �տ������� K��° �ִ� ���� ����Ѵ�.
 * Scanner���->�ð��ʰ�
 * List���->4924ms
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class algo11004K��°�� {

	public static void main(String[] args) throws IOException {	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmp = br.readLine().split(" ");
		int N=Integer.parseInt(tmp[0]);
		int K=Integer.parseInt(tmp[1]);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		List<Integer> arr = new LinkedList<>();
		for(int i=0; i<N; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		arr.sort(null);
		
		System.out.println(arr.get(K-1));		
	}
	

}
