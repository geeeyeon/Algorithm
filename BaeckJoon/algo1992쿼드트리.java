/*https://www.acmicpc.net/problem/1992
 * 쿼드트리
 * NxN 크기의 영상을 압축한 결과를 출력
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algo1992쿼드트리 {
	static int[][] map;
	static StringBuffer sb;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		
		sb = new StringBuffer();
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<N; j++) {
				map[i][j]=Integer.parseInt(str.charAt(j)+"");
			}
		}//배열에 넣기
		
		QuadTree(0,0,N);
		
		System.out.println(sb.toString());
		
	}
	
	static void QuadTree(int row, int col, int N) {
		if(check(row, col, N)==true) {
			System.out.print(map[row][col]);
		}
		else {
			System.out.print("(");
			int size=N/2;
			
			QuadTree(row, col, size);
			QuadTree(row, col+size, size);
			QuadTree(row+size, col, size);
			QuadTree(row+size, col+size, size);
			
			System.out.print(")");
			
		}
	}
	
	static boolean check(int row, int col, int N) {
		int tmp = map[row][col];
		
		for(int i=row; i<row+N; i++) {
			for(int j=col; j<col+N; j++) {
				if(tmp!=map[i][j]) return false;
			}
		}
		return true;
	}
}