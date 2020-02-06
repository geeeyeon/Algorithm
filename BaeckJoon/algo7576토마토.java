import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class algo7576�丶�� {
	static int m, n;
	static int[][] box;
	//static boolean[][] visit;
	static int dx[]= {-1,0,1,0};//��,��,��,�Ʒ�
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
				if(box[i][j]==0) {	//��� �丶�䰡 ������
					System.out.println("-1");
					return;
				}
				if(count<box[i][j])	//��� �丶�䰡 ����
					count=box[i][j];
			}
		}
		System.out.println(count-1);
	}
	
	static void bfs() {
	
		while(!q.isEmpty()) {
			Pair p = q.poll();	//poll() : ť���� ������ ��ȯ
			for(int i=0; i<4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				
				if(nx>=0 && nx<n && ny>=0 && ny<m) {//�ڽ� ���� �ȿ���
					if(box[nx][ny]==0) {	//������ �丶���
						box[nx][ny]=box[p.x][p.y]+1;	//�丶�並 ������					
						q.add(new Pair(nx,ny));	//ť�� �ֱ�
					}
				}
			}
		}
		
	}

}
