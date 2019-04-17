public class IntStack {
	private int max;
	private int ptr;
	private int[] stk;
	
	//예외 : 스택이 비어 있음
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	//예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	//생성자
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		}catch(OutOfMemoryError e) {
			max=0;
		}
	}
	
	//스택에 x 푸시
	public int push(int x) throws OverflowIntStackException{
		if(ptr>=max)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	//팝
	public int pop() throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	//피크
	public int peek() throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}
	//검색 (없으면 -1)
	public int indexOf(int x) {
		for(int i=ptr-1; i>=0; i--)
			if(stk[i]==x)
				return i;
		return -1;
	}
	//스택 비움
	public void clear() {
		ptr=0;
	}
	//용량
	public int capacity() {
		return max;
	}
	//데이터 수 반환
	public int size() {
		return ptr;
	}
	//비어있음?
	public boolean isEmpty() {
		return ptr<=0;
	}
	//가득참:
	public boolean isFull() {
		return ptr>=max;
	}
	//출력 : 바닥->꼭대기 순서
	public void dump() {
		if(ptr<=0)
			System.out.println("스택이 비어 있습니다.");
		else{
			for(int i=0; i<ptr; i++)
				System.out.print(stk[i]+" ");
			System.out.println();
		}
	}

}
