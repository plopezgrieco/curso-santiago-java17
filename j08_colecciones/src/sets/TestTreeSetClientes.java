package sets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetClientes {

	public static void main(String[] args) {
		Set<Cliente> clientes = new TreeSet<>(new ClienteEmailComparator());
		clientes.addAll(Cliente.getClientes());
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
		System.out.println("----------------");
		//Ordenar por id descente
		Set<Cliente> clientes2 = new TreeSet<Cliente>((c1, c2) -> c2.getId()-c1.getId());
		clientes2.addAll(clientes);
		clientes2.forEach(c -> System.out.println(c));
		
	}
	
	private static class ClienteEmailComparator  implements Comparator<Cliente>{
		@Override
		public int compare(Cliente c1, Cliente c2) {
			return c1.getEmail().compareToIgnoreCase(c2.getEmail());
		}
	}
}
