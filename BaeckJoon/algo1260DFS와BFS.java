/*https://www.acmicpc.net/problem/1260
 * DFS�� BFS
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class algo1260DFS��BFS {
	static boolean[] visit;
	static int[][] map;
	static int N,M,V;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();	//������ ����
		M = sc.nextInt();	//������ ����
		V = sc.nextInt();	//Ž�� ������ ������ȣ
		
		map = new int[N+1][N+1];
		visit = new boolean[N+1];
		
		for(int i=1; i<=M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a][b] = map[b][a] = 1;	
		}
		
		dfs(V);
		for(int i=1; i<=N; i++) {
			visit[i]=false;	//�ʱ�ȭ
		}
		System.out.println();
		bfs(V);
	}
	
	static void dfs(int v) {
		visit[v] = true;
		System.out.print(v+" ");
		for(int i=1; i<=N; i++) {
			if(map[v][i]==1 && visit[i]==false) dfs(i);
		}
	}
	
	static void bfs(int v) {
		Queue<Integer> q = new LinkedList<>();
		q.add(v);
		visit[v]=true;
		
		while(!q.isEmpty()) {
			v=q.poll();
			System.out.print(v+" ");
			for(int i=1; i<=N; i++) {
				if(map[v][i]==1&!visit[i]) {
					q.offer(i);
					visit[i]=true;
				}
			}
		}
	}

}
