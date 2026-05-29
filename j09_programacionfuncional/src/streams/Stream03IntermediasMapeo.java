package streams;

import static streams.Stream02Intermedias.getStream;
import static streams.Stream02Intermedias.muestra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream03IntermediasMapeo {
	public static void main(String[] args) {
		
		Stream<String> str;
		
		// map(Function<T, R>:Stream<R>
//		str = getStream().map(c -> c.toUpperCase());
		str = getStream().map(String::toUpperCase);
		muestra(str);
		
		// map(Function<T, R>:Stream<R>
//		str = getStream().map(c -> c.toUpperCase());
		str = getStream().map(String::toUpperCase).distinct().map(c -> c.substring(0, 4));
		muestra(str);
		
		IntStream iStr = getStream().mapToInt(String::length);
		iStr.forEach(System.out::println);
		System.out.println();

		getStream().mapToInt(String::length).forEach(System.out::println);
		
		Stream<Integer> intStr = getStream().map(String::length);
		muestra(intStr);

		
		// flatMap
		List<String> cursos = List.of("Programacion Java", "Lambdas Funcional", "Metodologías Ágiles");
		cursos.stream()
			.map(c -> c.split(" ")) //Stream<String> >> Stream<String[]>
//			.flatMap(a -> Arrays.stream(a)) //Stream<String[]> >> Stream<String>
			.flatMap(Arrays::stream) //Stream<String[]> >> Stream<String>
			.forEach(System.out::println);
		
		List<Autor> autores = List.of(
						new Autor(List.of("Libro A", "Libro B")),
						new Autor(List.of("Libro C", "Libro D", "Libro E"))
						);
		//usando map
		List<List<String>> listaLibros = 
			autores.stream()
			.map(Autor::getLibros) //Stream<Autor> >> Steam<List<String>>
			.toList();
		listaLibros.forEach(System.out::println);
		System.out.println();
		
		//usando flatMap
		List<String> libros =
			autores.stream()
			.flatMap(a -> a.getLibros().stream())
			.toList();
		libros.forEach(System.out::println);
	}
	
	private static class Autor {
		List<String> libros;

		public Autor(List<String> libros) {
			this.libros = libros;
		}
		public List<String> getLibros() {
			return libros;
		}

	}
}
