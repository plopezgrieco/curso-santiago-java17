package novedadescolecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import model.Cliente;

public class Novedades {
	public static void main(String[] args) {
		
		// Crea una lista "inmutable"
		System.out.println("Lista/Set inmutable con List.of(...) / Set.of(...)");
		List<String> palabras = List.of("uno", "dos", "tres", "cuatro");
		palabras.forEach(System.out::println);
		//Set.of(...)
		System.out.println("------------------");
		
		// Mapa inmutable
		System.out.println("Map inmutable con Map.of(...)");
		System.out.println("Recorrido con forEach(Biconsumer)");
		Map<Integer, String> mapValores = Map.of(1, "uno", 2, "dos", 3, "tres");
		mapValores.forEach((k, v) -> System.out.println(k + ": " + v));
		System.out.println("------------------");
		
		// Crear colecciones y mapas inmutables a partir de una existente
		System.out.println("colecciones y mapas inmutables a partir de una existente");
		System.out.println("con List.copyOf() / Set.copyOf() / Map.copyOf()");
		List<Cliente> clientes = Cliente.getClientes();
		System.out.println(clientes.size());
		clientes.remove(0);
		System.out.println(clientes.size());
		
		List<Cliente> cliInmutable = List.copyOf(clientes);
		System.out.println(cliInmutable.size());
//		cliInmutable.remove(0);
		System.out.println("------------------");

		//Collection.removeIf(...)
		System.out.println("Collection.removeIf(Predicate)");
		List<String> lista = new ArrayList<String>(palabras);
		lista.forEach(System.out::println);
		lista.removeIf(s -> s.contains("u"));
		lista.forEach(System.out::println);
		System.out.println("------------------");
		
		//List.replaceAll(UnaryOperator)
		System.out.println("List.replaceAll(UnaryOperator)");
//		lista.replaceAll(s -> s.toUpperCase());
		lista.replaceAll(String::toUpperCase);
		lista.forEach(System.out::println);
		System.out.println("------------------");
		
		//List.sort(Comparator)
		System.out.println("List.sort(Comparator)");
		lista = new ArrayList<>(List.of("uno", "cincuenta", "tres", "0", "ochentamil"));
		lista.sort(Comparator.naturalOrder());
		lista.forEach(System.out::println);
		
		System.out.println();
		lista.sort((p1, p2) -> Integer.compare(p1.length(), p2.length()));
		lista.forEach(System.out::println);

		System.out.println();
		lista = new ArrayList<>(List.of("uno", "cincuenta", "tres", "0", "ochentamil"));
		lista.sort(Comparator.comparingInt(String::length));
		lista.forEach(System.out::println);
		
		
	}
}
