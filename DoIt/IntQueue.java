
public class IntQueue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	//예외 : 큐가 비어있음
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	//예외 : 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	//생성자
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	//인큐
	public int enque(int x) throws OverflowIntQueueException{
		if(num>=max) throw new OverflowIntQueueException();
		que[rear++] = x;
		num++;
		if(rear==max) rear=0;
		return x;
	}
	//디큐
	public int deque() throws EmptyIntQueueException{
		if(num<=0) throw new EmptyIntQueueException();
		int x=que[front++];
		num--;
		if(front==max) front=0;
		return x;
	}
	//피크
	public int peek() throws EmptyIntQueueException{
		if(num<=0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	//검색(없으면-1)
	public int indexOf(int x) {
		for(int i=0; i<num; i++) {
			int idx = (i+front)%max;
			if(que[idx]==x) return idx;
		}
		return -1;
	}
	//큐 비움
	public void clear() {
		num = front = rear = 0;
	}
	//용량 반환
	public int capacity() {
		return max;
	}
	//큐에 쌓여 있는 데이터 수
	public int size() {
		return num;
	}
	//큐가 비어잇는지
	public boolean isEmpty() {
		return num<=0;
	}
	//큐가 가득차있는지
	public boolean isFull() {
		return num>=max;
	}
	//출력 (프런트->리어 순)
	public void dump() {
		if(num<=0)
			System.out.println("큐가 비어있습니다.");
		else {
			for(int i=0; i<num; i++)
				System.out.print(que[(i+front)%max]+" ");
			System.out.println();
		}
	}
	//데이터 검색(큐 안에서 몇 번째에 있는지)
	public int search(int x) {
		for(int i=0; i<num; i++) {
			if(que[(i+front)%max]==x)
				return i+1;//i는 0부터
			return 0;
		}
		return 0;
	}
	
}
