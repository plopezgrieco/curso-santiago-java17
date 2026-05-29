package streams;

import java.util.List;
import java.util.Optional;

public class Stream04TerminalesReduccion {

	public static void main(String[] args) {
		List<Integer> nums = List.of(17, 50, 13, -2, 101);
		
		Optional<Integer> maximo = nums.stream().max(Integer::compareTo);
		System.out.println("max: " + maximo.orElse(Integer.MIN_VALUE));
		
		int min = nums.stream().min(Integer::compareTo).orElse(Integer.MAX_VALUE);
		System.out.println("min: " + min);
		
		//contar los pares
		System.out.println("cant. pares: " + 
			nums
			.stream()
			.filter(n -> n % 2 == 0)
			.count()
		);
		
		//calcula la media
		System.out.println("avg: " + 
			nums.stream().mapToDouble(Integer::doubleValue).average().orElse(Integer.MIN_VALUE));
		
		//sumatoria
		System.out.println("sum: " +
			nums.stream().mapToInt(Integer::intValue).sum()
		);
		
		System.out.println("------------");
		
		nums = List.of(1, 2, 3, 4);
		//reduce
		System.out.println(nums.stream().reduce(Integer::max));
		System.out.println("producto: " + nums.stream().reduce(1, (x, y) -> x * y));
	}
}
