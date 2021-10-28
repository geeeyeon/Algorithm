//https://www.acmicpc.net/problem/1697
//점 N(0<=N<=100,000>), K(0<=K<=100,000>)
//현재 위치가 X일 때, 1초 후 X-1 or X+1 or X*2로 이동

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class algo1697 {
	static int N,K;
	static int[] visited = new int[100001];  //[100000]로 선언하면 런타임에러가 나는 이유
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		
		find();
	}
	
	static void find() {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(N);
		visited[N]=1;
		
		while(!q.isEmpty()) {
			N=q.poll();
			if(N==K)//조건 맞을 때
				break;
			if(N-1>=0 && visited[N-1]==0) {
				q.add(N-1);
				visited[N-1]=visited[N]+1;
			}
			if(N+1<=100000 && visited[N+1]==0) {
				q.add(N+1);
				visited[N+1]=visited[N]+1;
			}
			if(N*2<=100000 && visited[N*2]==0) {
				q.add(N*2);
				visited[N*2]=visited[N]+1;
			}
				
		}
		System.out.println(visited[N]-1);
	}


}
