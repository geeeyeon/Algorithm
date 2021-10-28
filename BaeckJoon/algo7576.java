/* https://www.acmicpc.net/problem/7576
 * �丶�乮��
 * �丶�並 â�� �����ϴ� ���ڸ���� ���ڵ��� ũ��� ���� �丶���� ���� ���� �丶����� ������ �־����� ��, ��ĥ�� ������ �丶����� ��� �ʹ���, �� �ּ� �ϼ��� ���ϴ� ���α׷��� �ۼ��϶�. 
 * ��, ������ �Ϻ� ĭ���� �丶�䰡 ������� ���� ���� �ִ�.
 * ����� ������ ��� �丶�䰡 �;��ִ� �����̸� 0�� ����ؾ� �ϰ�, �丶�䰡 ��� ������ ���ϴ� ��Ȳ�̸� -1�� ���
 */



import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class algo7576 {
	
	static int n,m;

	static int row[]= {0,0,1,-1};//��,�Ʒ�,������,����
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
				if(box[i][j]==1) {//�丶�䰡 ����ִ� ĭ �˻�
					q.add(new Pair(i,j));
					tomato[i][j]=true;//�丶�� �ִ� ĭ ǥ��
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
				
				if(visitX<0 || visitX>=n || visitY<0 || visitY>=m) //������ ������ ��� ���
					continue;
				
				else if(tomato[visitX][visitY]==false) //�̹� �湮�� ��
					continue;
				
				else if(box[visitX][visitY]==0) 
					continue;
				
				else if(box[visitX][visitY]==-1) //�丶�䰡 ���� ��
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
