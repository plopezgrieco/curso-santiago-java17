package streams;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream01Instanciar {
	public static void main(String[] args) {
		
		//Collection.stream
		Stream<Integer> str1 = List.of(5, 7, 19, -89).stream();
		str1.forEach(System.out::println);
		System.out.println("------------");
		
		//Stream.of     Stream.of(T...):Stream<T>
		Stream<Integer> str2 = Stream.of(89, 67, -456);
		str2.forEach(System.out::println);
		System.out.println("------------");
		
		//Desde array
		String[] nombres = {"Juan", "Ana", "Marta"};
		Stream<String> str3 = Stream.of(nombres);
		str3.forEach(System.out::println);
		System.out.println("------------");

		//Stream.iterate(T, UnaryOperator<T>):Stream<T>
			//Generar 30 números impares desde 101
		Stream<Integer> str4 = Stream.iterate(101, n -> n + 2).limit(30);
		str4.forEach(System.out::println);
		System.out.println("------------");
		
		//IntStream.range(int, int):IntStream
		IntStream str5 = IntStream.range(1000, 1020);
		str5.forEach(System.out::println);
		System.out.println("------------");
		
		//Stream.generate(Supplier<T>):Stream<T>
		Stream<Double> str6 = Stream.generate(() -> Math.floor(Math.random() * 2) + 1);
		str6.limit(15).forEach(System.out::println);
		
	}
}
