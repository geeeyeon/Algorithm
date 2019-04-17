
public class IntQueue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	//���� : ť�� �������
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	//���� : ť�� ���� ��
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	//������
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	//��ť
	public int enque(int x) throws OverflowIntQueueException{
		if(num>=max) throw new OverflowIntQueueException();
		que[rear++] = x;
		num++;
		if(rear==max) rear=0;
		return x;
	}
	//��ť
	public int deque() throws EmptyIntQueueException{
		if(num<=0) throw new EmptyIntQueueException();
		int x=que[front++];
		num--;
		if(front==max) front=0;
		return x;
	}
	//��ũ
	public int peek() throws EmptyIntQueueException{
		if(num<=0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	//�˻�(������-1)
	public int indexOf(int x) {
		for(int i=0; i<num; i++) {
			int idx = (i+front)%max;
			if(que[idx]==x) return idx;
		}
		return -1;
	}
	//ť ���
	public void clear() {
		num = front = rear = 0;
	}
	//�뷮 ��ȯ
	public int capacity() {
		return max;
	}
	//ť�� �׿� �ִ� ������ ��
	public int size() {
		return num;
	}
	//ť�� ����մ���
	public boolean isEmpty() {
		return num<=0;
	}
	//ť�� �������ִ���
	public boolean isFull() {
		return num>=max;
	}
	//��� (����Ʈ->���� ��)
	public void dump() {
		if(num<=0)
			System.out.println("ť�� ����ֽ��ϴ�.");
		else {
			for(int i=0; i<num; i++)
				System.out.print(que[(i+front)%max]+" ");
			System.out.println();
		}
	}
	//������ �˻�(ť �ȿ��� �� ��°�� �ִ���)
	public int search(int x) {
		for(int i=0; i<num; i++) {
			if(que[(i+front)%max]==x)
				return i+1;//i�� 0����
			return 0;
		}
		return 0;
	}
	
}
