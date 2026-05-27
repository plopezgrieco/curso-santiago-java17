package referenciametodos;

import java.util.List;

public class Ejemplos {
	public static void main(String[] args) {
		
		List<Integer> nums = List.of(17, -75, 81, -116, 0);
		List<String> nombres = List.of("María", "Fernando", "Oscar", "Ana");
		
		//Mostrar el valor absoluto
		//con lambda
		nums.forEach(n -> System.out.println(Math.abs(n)));
		System.out.println();
		
		//con stream() y referencia a metodo
		nums.stream().map(Math::abs).forEach(System.out::println);
		System.out.println("--------------");
		
		//Referencia a método estático propio
		nums.stream().map(Math::abs).map(Ejemplos::raiz).forEach(System.out::println);
		System.out.println("--------------");
		
		//Referencia a método de objeto existente
		String saludo = "Buenos días ";
		nombres.stream().map(saludo::concat).forEach(System.out::println);
		System.out.println("--------------");
		
		//Referencia a método de instacia de un tipo
		nombres.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("--------------");
		
		//Refencia a método constructor
		nombres.stream().map(Persona::new).forEach(System.out::println);
		System.out.println();
		
		List<Persona> personas = nombres.stream().map(Persona::new).toList();
		personas.forEach(System.out::println);
	}
		
	private static double raiz(int num) {
		return Math.sqrt(num);
	}
	
	private static class Persona {
		String nombre;

		public Persona(String nombre) {
			this.nombre = nombre;
		}

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + "]";
		}
	}
}
