package aa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class algo2178 {
	static int map[][]=new int[100][100];
	static boolean visited[][]=new boolean[100][100];
	static int n, m;
	static int row[]= {0,0,1,-1};//위,아래,오른쪽,왼쪽
	static int col[]= {1,-1,0,0};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		String road = "";
		
		for(int i=0; i<n; i++) {
			road = sc.next();
			for(int j=0; j<m; j++) {
				map[i][j]=road.charAt(j)-'0';
				visited[i][j]=true;
			}
		}
		find();
	}
	static void find() {
		int count = 0;
		int temp, side, upside;
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(0);
		while(!q.isEmpty()) {
			for(int i=0; i<q.size();i++) {
				temp=q.poll();
				upside=temp/10;
				side=temp%10;
				
				
				if(upside==n-1 && side==m-1) { //도착지점에 도착했을 때
					count++;
					System.out.println(count);
					break;
				}
				for(int j=0; j<4; j++) {//동서남북으로 검사
					int ch_upside = upside + row[j];
					int ch_side = side + col[j];
					
					if(ch_side<0 || ch_side>=n || ch_upside<0 || ch_upside>=m) {//지도의 범위를 벗어난 경우
						continue;
					}
					else if(visited[ch_side][ch_upside]==false) {//이미 방문한 곳
						continue;
					}
					else if(map[ch_side][ch_upside]==0) {
						continue;
					}
					
					visited[ch_side][ch_upside]=false;
					q.offer(ch_upside*10+ch_side);
				}				
			}
			count++;
		}
		System.out.println(count);
	}

}
