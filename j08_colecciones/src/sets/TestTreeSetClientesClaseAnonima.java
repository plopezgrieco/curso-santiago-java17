package sets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetClientesClaseAnonima {

	public static void main(String[] args) {
		Set<Cliente> clientes = new TreeSet<>(new Comparator<Cliente>() {
			@Override
			public int compare(Cliente c1, Cliente c2) {
				return c1.getEmail().compareToIgnoreCase(c2.getEmail());
			}
		});
		clientes.addAll(Cliente.getClientes());
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}
}
