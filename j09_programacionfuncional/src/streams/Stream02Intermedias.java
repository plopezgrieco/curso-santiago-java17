package streams;

import java.util.stream.Stream;

public class Stream02Intermedias {
	public static void main(String[] args) {
		
		// filter(Predicate<? super T> predicate):Stream<T>
		System.out.println("Filter");
		Stream<String> str = getStream().filter(c -> c.contains("d"));
		muestra(str);
		
		// distinct():Stream<T>
		System.out.println("distinct");
		str = getStream().distinct();
		muestra(str);
		
		// limit(long n):Stream<T>
		System.out.println("limit");
		str = getStream().limit(3);
		muestra(str);
		
		// skip(long n):Stream<T>
		System.out.println("skip");
		str = getStream().skip(3);
		muestra(str);
		
		// peek(Consumer<? super T> action):Stream<T>
		System.out.println("peek");
		str = getStream().peek(System.err::println);
		muestra(str);
		
		// takeWhile(Predicate<? super T> predicate):Stream<T>
		System.out.println("takeWhile");
		// Se detiene el flujo en cuanto el predicado es false
		str = getStream().takeWhile(c -> !c.startsWith("P"));
		muestra(str);
		
		// dropWhile(Predicate<? super T> predicate):Stream<T>
		System.out.println("dropWhile");
		// Elimina objetos del flujo mientras el predicado es verdadero
		//	Una vez que da false, ya no evalúa mas
		str = getStream().dropWhile(c -> !c.startsWith("R"));
		muestra(str);
	}
	
	public static Stream<String> getStream(){
		return Stream.of("Santiago", "Madrid", "Rosario", "Santiago", "Pontevedra");
	}
	
	public static void muestra(Stream<?> str) {
		str.forEach(System.out::println);
		System.out.println("----------------------");
	}
}
