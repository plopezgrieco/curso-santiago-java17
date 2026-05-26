package sets;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		Set<String> cadenas = new TreeSet<String>();

		cadenas.add("uno");
		cadenas.add("dos");
		cadenas.add("tres");
		cadenas.add("4");
		cadenas.add("5");
		cadenas.add("arriba");
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
