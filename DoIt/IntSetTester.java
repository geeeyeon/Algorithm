
public class IntSetTester {

	public static void main(String[] args) {
		IntSet s1=new IntSet(20);
		IntSet s2=new IntSet(20);
		IntSet s3=new IntSet(20);
		
		s1.add(10);
		s1.add(15);
		s1.add(20);
		s1.add(25);//s1={10,15,20,25}
		
		s1.copyTo(s2);//s2={10,15,20,25}
		s2.add(12);
		s2.remove(25);//s2={10,15,20,12}
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);

		System.out.println("집합 s1에 15는 "+(s1.contains(15)? "포함됨":"포함안됨"));
		System.out.println("집합 s2에 25는 "+(s2.contains(25)? "포함됨":"포함안됨"));
		System.out.println("집합 s1과 s2는 "+(s1.equalTo(s2)? "같다":"다르다"));
		System.out.println("집합 s2와 s3는 "+(s2.equalTo(s3)? "같다":"다르다"));
		s3.unionOf(s1, s2);//s3 <- s1 U s2
		System.out.println("집합 s1과 s2의 합집합은 "+s3+"이다.");
		System.out.println("집합 s1은 "+(s1.isEmpty()?"비어있다":"비어있지않다"));
		System.out.println("집합 s2는 "+(s2.isFull()?"가득차있다":"가득차있지않다"));
	}

}
