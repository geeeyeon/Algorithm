/*https://www.acmicpc.net/problem/1780
 * ������ ����
 * ù° �ٿ� -1, ��° �ٿ� 0, ��° �ٿ� 1�θ� ä���� ������ ���� ���ϱ�
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo1780�����ǰ��� {

	static int[][] map;
	static StringBuffer sb;
	static int[] count = new int[3];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		
		sb = new StringBuffer();
		
		for(int i=0 ; i<N ; i++){
           StringTokenizer st = new StringTokenizer(br.readLine());
           for(int j=0 ; j<N ; j++){
               map[i][j] = Integer.parseInt(st.nextToken());
           }
		}//�迭�� �ֱ�
		
		 
		Paper(0,0,N);
		
		System.out.println(count[0]);//-1 ����
		System.out.println(count[1]);//0 ����
		System.out.println(count[2]);//1 ����
		
	}
	
	static void Paper(int row, int col, int N) {
		if(check(row,col,N)==true) 
			return;
		
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
				Paper(row+j*N/3, col+i*N/3, N/3);
		
	}
	
	static boolean check(int row, int col, int N) {
		int tmp = map[row][col];
		
		for(int i=row; i<row+N; i++) {
			for(int j=col; j<col+N; j++) {
				if(tmp!=map[i][j])
					return false;
			}
		}
		count[tmp+1]++;
		return true;
	}

}
