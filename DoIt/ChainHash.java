
public class ChainHash<K,V> {
	//해시 구성 노드
	class Node<K,V>{
		private K key;	//키값
		private V data;	//데이터
		private Node<K,V> next; //다음 노드에 대한 참조
		
		//생성자
		Node(K key, V data, Node<K,V> next){
			this.key = key;
			this.data = data;
			this.next = next;
		}
		
		//키 값 반환
		K getKey() {
			return key;
		}
		
		//데이터 반환
		V getValue() {
			return data;
		}
		
		//키의 해시 값 반환
		public int hashCode() {
			return key.hashCode();
		}
	}
	
	private int size;
	private Node<K,V>[] table;	//해시 테이블
	
	//생성자
	public ChainHash(int capacity) {
		try {
			table = new Node[capacity];
			this.size = capacity;
		}catch(OutOfMemoryError e) {
			this.size=0;
		}
	}
	
	//해시 값 구하기
	public int hashValue(Object key) {
		return key.hashCode()%size;
	}
	
	//키 값 key를 갖는 요소의 검색(데이터반환)
	public V search(K key) {
		int hash = hashValue(key);	//검색할 데이터의 해시 값
		Node<K,V> p = table[hash]; 	//선택 노드
		
		while(p!=null) {
			if(p.getKey().equals(key))
				return p.getValue();	//검색 성공
			p = p.next;	//다음 노드
		}
		return null;					//검색 실패
	}
	
	//키 값 key, 데이터 data를 갖는 요소의 추가
	public int add(K key, V data) {
		int hash = hashValue(key);	//추가할 데이터의 해시 값
		Node<K,V> p = table[hash];	//선택 노드
		
		while(p!=null) {
			if(p.getKey().equals(key))	//이미 등록된 key
				return 1;
			p=p.next;
		}
		Node<K,V> temp = new Node<K,V>(key, data, table[hash]);
		table[hash] = temp;				//노드 삽입
		return 0;
	}
	
	//키 값 key를 갖는 요소 삭제
	public int remove(K key) {
		int hash = hashValue(key);		//삭제할 데이터의 해시 값
		Node<K,V> p = table[hash];		//선택 노드
		Node<K,V> pp = null;			//바로 앞 선택 노드
		
		while(p!=null) {
			if(p.getKey().equals(key)) {	//찾으면
				if(pp==null)
					table[hash]=p.next;
				else
					pp.next = p.next;
				return 0;
			}
			pp=p;
			p=p.next;
		}
		return 1;		//찾는 키 값이 없음
	}
	
	//해시 테이블을 덤프
	public void dump() {
		for(int i=0; i<size; i++) {
			Node<K,V> p = table[i];
			System.out.printf("%02d ", i);
			while(p!=null) {
				System.out.printf("-> %s (%s) ",p.getKey(),p.getValue());
				p=p.next;
			}
			System.out.println();
		}
	}

}
