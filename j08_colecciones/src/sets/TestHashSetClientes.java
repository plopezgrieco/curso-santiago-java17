package sets;

import java.util.HashSet;
import java.util.Set;

public class TestHashSetClientes {

	public static void main(String[] args) {
		Set<Cliente> clientes = new HashSet<>(Cliente.getClientes());
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}
}
