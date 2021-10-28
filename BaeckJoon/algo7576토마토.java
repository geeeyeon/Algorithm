import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class algo7576토마토 {
	static int m, n;
	static int[][] box;
	//static boolean[][] visit;
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

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		box = new int[n][m];
		//visit = new boolean[n][m];
		
		for(int i=0; i<n; i++) {		
			for(int j=0; j<m; j++) {				
				box[i][j]=sc.nextInt();
				if(box[i][j]==1)
					q.offer(new Pair(i,j));
			}
		}
		bfs();
		
		int count=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(box[i][j]==0) {	//모든 토마토가 안익음
					System.out.println("-1");
					return;
				}
				if(count<box[i][j])	//모든 토마토가 익음
					count=box[i][j];
			}
		}
		System.out.println(count-1);
	}
	
	static void bfs() {
	
		while(!q.isEmpty()) {
			Pair p = q.poll();	//poll() : 큐에서 꺼내서 반환
			for(int i=0; i<4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				
				if(nx>=0 && nx<n && ny>=0 && ny<m) {//박스 범위 안에서
					if(box[nx][ny]==0) {	//안익은 토마토면
						box[nx][ny]=box[p.x][p.y]+1;	//토마토를 익히고					
						q.add(new Pair(nx,ny));	//큐에 넣기
					}
				}
			}
		}
		
	}

}
