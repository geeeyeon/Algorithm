/*https://www.acmicpc.net/problem/2178
 * �̷�Ž�� - bfs
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class algo2178�̷�Ž�� {
	static int n,m;
	static int[][] map;
	static boolean[][] visit;
	static int dx[]= {-1,0,1,0};//��,��,��,�Ʒ�
	static int dy[]= {0,-1,0,1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		map = new int[n+1][m+1];
		visit = new boolean[n+1][m+1];
		
		
		
		for(int i=0; i<n; i++) {
			String tmp = sc.next();
			for(int j=0; j<m; j++) {
				map[i][j]=tmp.charAt(j)-'0';
				visit[i][j]=false;
			}
		}
		visit[0][0]=true;
		bfs(0,0); //����
		System.out.println(map[n-1][m-1]);
				
	}
	
	static public void bfs(int x, int y) {
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(x,y));
		map[0][0]=1;
		while(!q.isEmpty()) {
			Pair p = q.poll();
			for(int i=0; i<4; i++) {
				//���� �湮 nextx, nexty
				int nextx = p.x+dx[i];
				int nexty = p.y+dy[i];
				
				if(nextx<0||nexty<0||nextx>=n||nexty>=m) continue;
				if(visit[nextx][nexty]||map[nextx][nexty]==0) continue;//�̹̹湮
				
				//���� �湮�� ��ǥ
				q.add(new Pair(nextx, nexty));
				
				map[nextx][nexty]=map[p.x][p.y]+1;
				visit[nextx][nexty]=true;
				
			}
			
		}
	}
}
class Pair{
	int x;
	int y;
	
	Pair(int x, int y){
		this.x=x;
		this.y=y;
	}
}

