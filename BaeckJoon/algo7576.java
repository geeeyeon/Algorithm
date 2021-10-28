/* https://www.acmicpc.net/problem/7576
 * 토마토문제
 * 토마토를 창고에 보관하는 격자모양의 상자들의 크기와 익은 토마토들과 익지 않은 토마토들의 정보가 주어졌을 때, 며칠이 지나면 토마토들이 모두 익는지, 그 최소 일수를 구하는 프로그램을 작성하라. 
 * 단, 상자의 일부 칸에는 토마토가 들어있지 않을 수도 있다.
 * 저장될 때부터 모든 토마토가 익어있는 상태이면 0을 출력해야 하고, 토마토가 모두 익지는 못하는 상황이면 -1을 출력
 */



import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class algo7576 {
	
	static int n,m;

	static int row[]= {0,0,1,-1};//위,아래,오른쪽,왼쪽
	static int col[]= {1,-1,0,0};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		int box[][]=new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				box[i][j]=sc.nextInt();
			}
		}
		tomato(box,n,m);
	}
	static void tomato(int box[][],int n,int m) {
		Queue<Pair> q = new LinkedList<Pair>();
		boolean tomato[][] = new boolean[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(box[i][j]==1) {//토마토가 들어있는 칸 검사
					q.add(new Pair(i,j));
					tomato[i][j]=true;//토마토 있는 칸 표시
				}
			}
		}
		
		while(!q.isEmpty()) {
			Pair point = q.poll();
			int pointX = point.getX();
			int pointY = point.getY();
			
			for(int i=0; i<4; i++) {
				int visitX=pointX+row[i];
				int visitY=pointY+col[i];
				
				if(visitX<0 || visitX>=n || visitY<0 || visitY>=m) //지도의 범위를 벗어난 경우
					continue;
				
				else if(tomato[visitX][visitY]==false) //이미 방문한 곳
					continue;
				
				else if(box[visitX][visitY]==0) 
					continue;
				
				else if(box[visitX][visitY]==-1) //토마토가 없을 때
					continue;
				
				q.add(new Pair(visitX,visitY));
				tomato[visitX][visitY]=false;
				
			}
		}
		
	}
	
	
	static class Pair{
		private int x;
		private int y;
		
		Pair(int x, int y) {
			this.x=x;
			this.y=y;
		}
		int getX() {return this.x;}
		int getY() {return this.y;}
	}

}
