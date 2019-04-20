
public class IntSet {
	private int max; //집합의 최대 개수
	private int num; //집합의 요소 개수
	private int[] set; //집합 본체
	
	//생성자
	public IntSet(int capacity) {
		num=0;
		max=capacity;
		try {
			set=new int[max];
		}catch(OutOfMemoryError e) {
			max=0;
		}
	}
	
	//집합의 최대 개수
	public int capacity() {
		return max;
	}
	
	//집합의 요소 개수
	public int size() {
		return num;
	}
	
	//집합에서 n 검색(index반환)
	public int indexOf(int n) {
		for(int i=0; i<num; i++) 
			if(set[i]==n)
				return i;
		return -1;
	}
	
	//집합에 n이 있는지 없는지 확인
	public boolean contains(int n) {
		return (indexOf(n) != -1)?true:false;
	}
	
	//집합에 n 추가
	public boolean add(int n) {
		if(num>=max || contains(n)==true)//가득 찼거나 이미n존재
			return false;
		else {
			set[num++]=n;//마지막 자리에 추가
			return true;
		}
	}
	
	//집합에서 n 삭제
	public boolean remove(int n) {
		int idx;//n이 저장된 요소의 인덱스
		
		if(num<=0||(idx=indexOf(n))==-1)//비어있거나 n이 존재하지않음
			return false;
		else {
			set[idx]=set[--num];//마지막 요소를 삭제한곳으로 옮김
			return true;
		}
	}
	
	//집합 s에 복사
	public void copyTo(IntSet s) {
		int n=(s.max<num) ? s.max : num; //복사할 요소 개수
		for(int i=0; i<n; i++)
			s.set[i]=set[i];
		s.num=n;
	}
	
	//집합 s를 복사
	public void copyForm(IntSet s) {
		int n=(max<s.num) ? max:s.num; //복사할 요소 개수
		for(int i=0; i<n; i++)
			set[i]=s.set[i];
		num=n;
	}
	
	//집합 s와 같은지 확인
	public boolean equalTo(IntSet s) {
		if(num != s.num) //요소의 개수가 다르면 false
			return false;
		for(int i=0; i<num; i++) {
			int j=0;
			for(;j<s.num;j++)
				if(set[i]==s.set[j])
					break;
			if(j==s.num)
				return false;
		}
		return true;
	}
	
	//집합 s1과 s2의 합집합 복사
	public void unionOf(IntSet s1, IntSet s2) {
		copyForm(s1);
		for(int i=0; i<s2.num; i++)
			add(s2.set[i]);
	}
	
	//"{a b c}"영식의 문자열로 표현 바꾸기
	public String toString() {
		StringBuffer temp = new StringBuffer("{");
		for(int i=0; i<num; i++)
			temp.append(set[i]+" ");
		temp.append("}");
		return temp.toString();
	}
	
	//공집합인지 확인
	public boolean isEmpty() {
		return num==0?true:false;
	}
	
	//집합이 가득 찼는지
	public boolean isFull() {
		return num>=max? true:false;
	}
	
	//집합 초기화
	public void clear() {
		num=0;
	}
	
	//집합 s와의 합집합 구하기(메서드의 실행에 따라 집합이 변경되는 경우에 true)
	public boolean add(IntSet s) {
		boolean flag = false;
		for(int i=0; i<num; i++) {
			if(add(set[i])==true)//set[i]를 add하여서 성공하면
				flag = true;//집합이 변경된 것이기 때문에 true반환
		}
		return flag;
	}
	
	//집합 s와의 교집합 구하기(메서드의 실행에 따라 집합이 변경되는 경우에 true)
	public boolean retain(IntSet s) {
		boolean flag = false;
		for(int i=0; i<num; i++) {
			if(s.contains(set[i])==false) {//포함하고 있으면
				remove(set[i]);
				flag = true;
			}
		}
		return flag;
	}
	
	//집합 s와의 차집합 구하기
	public boolean remove(IntSet s) {
		boolean flag = false;
		for(int i=0; i<num; i++) {
			if(s.contains(set[i])==true) {
				remove(set[i]);
				flag = true;
			}
		}
		return flag;
	}
}
