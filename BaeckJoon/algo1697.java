//https://www.acmicpc.net/problem/1697
//�� N(0<=N<=100,000>), K(0<=K<=100,000>)
//���� ��ġ�� X�� ��, 1�� �� X-1 or X+1 or X*2�� �̵�

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class algo1697 {
	static int N,K;
	static int[] visited = new int[100001];  //[100000]�� �����ϸ� ��Ÿ�ӿ����� ���� ����
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
			if(N==K)//���� ���� ��
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
