package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {
//		Set<String> cadenas = new HashSet<String>(1024);
		Set<String> cadenas = new LinkedHashSet<String>(1024);

		cadenas.add("uno");
		cadenas.add("dos");
		cadenas.add("tres");
		cadenas.add("4");
		cadenas.add("5");
		System.out.println(cadenas.add("sexto"));

		System.out.println(cadenas.add("4"));
		cadenas.add("tres");

		for (String nombre : cadenas) {
			System.out.println(nombre);
		}
		System.out.println("------");
		for (String nombre : cadenas) {
			int hash = nombre.hashCode();
			System.out.println(1023 & (hash ^ (hash >>> 16)));
		}
	}
}
