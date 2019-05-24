/*[Strea과 map을 이용하여 홀수에 대한 제곱의 합 구하기]
 * stream과 map을 이용하여 1부터 10 사이의 홀수에 대한 제곱의 합을 구하자
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForLambdaCondition {

	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<>();
		int s=0;
		for(int i=1; i<=10; i++)
			ilist.add(i);
		
		//stream filter map collect
		ilist = ilist.stream()
					.filter(i->i%2==1)	//filter:조건이 맞는 수를 찾을 때(홀수)
					.map(i->i*i)		//map:filter에서 찾은 수에 대해서 어떠한 처리명령(제곱)
					.collect(Collectors.toList());//collect:해당 수의 값을 새로운 리스트에 저장
		
		ilist.forEach(i->{System.out.printf(i+"\t");});
		System.out.println();
		
		//stream reduce
		s=ilist.parallelStream().reduce(0, Integer::sum);
		System.out.println("1~10사이의 홀수에 대한 제곱 합: "+s);
	}

}
