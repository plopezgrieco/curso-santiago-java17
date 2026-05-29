package sets;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetClientesMetodoEstatico {

	public static void main(String[] args) {
//		Set<Cliente> clientes = new TreeSet<>(Cliente.emailComparator());
		Set<Cliente> clientes = new TreeSet<>(Cliente.nombreComparator());
		clientes.addAll(Cliente.getClientes());
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}
}
