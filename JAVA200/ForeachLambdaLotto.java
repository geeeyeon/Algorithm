/*[foreach와  Lambda 형식을 이용하여 List 출력하기]
 * List에 저장된 데이터를 foreach와 Lambda 형식을 이용하여 List를 출력
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachLambdaLotto {

	public static void main(String[] args) {
		List<Integer> mmlists = Arrays.asList(1,6,16,22,23,33);
		mmlists.forEach(		//한개씩 출력하기 위해 List의 forEach메서드 이용
				m -> { System.out.printf(m+"\t");}
				);
		
		
		System.out.println();
		
		
		Consumer<Integer> consume = (Integer m)->{System.out.printf(m+"\t");};
		mmlists.forEach(consume);
			
		
	}

}
