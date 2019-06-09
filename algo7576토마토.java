import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class algo7576토마토 {
	static int m, n;
	static int[][] box;
	static boolean[][] visit;
	static int dx[]= {-1,0,1,0};//왼,위,오,아래
	static int dy[]= {0,-1,0,1};
	static Queue<Pair> q = new LinkedList<>();
	
	static class Pair{
		int x;
		int y;
		Pair(int x, int y){
			this.x=x;
			this.y=y;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmp = br.readLine().split(" ");
		
		m = Integer.parseInt(tmp[0]);
		n = Integer.parseInt(tmp[1]);
		box = new int[m][n];
		visit = new boolean[m][n];
		
		for(int i=0; i<m; i++) {
			String[] tmp1 = br.readLine().split(" ");
			for(int j=0; j<n; j++) {
				box[i][j]=tmp1[j].charAt(0)-'0';
				if(box[i][j]==1) q.add(new Pair(i,j));
			}
		}
		bfs();		
	}
	
	static void bfs() {
		int count=0;
		while(!q.isEmpty()) {
			Pair p = q.poll();	//poll() : 큐에서 꺼내서 반환
			for(int i=0; i<4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				
				if(nx>=0 && nx<n && ny>=0 && ny<m) {//박스 범위 안에서
					if(box[nx][ny]==0 && visit[nx][ny]==false) {
						q.add(new Pair(nx,ny));
						visit[nx][ny]=true;
						box[nx][ny]=box[p.x][p.y]+1;
						
					}
				}
			}
		}
		
		if(check())
			System.out.println(count);
		else
			System.out.println("-1");
	}
	static boolean check() {
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(box[i][j]==0)
					return false;
			}
		}
		return true;
	}

}
