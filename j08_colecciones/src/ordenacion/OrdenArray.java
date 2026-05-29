package ordenacion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import sets.Cliente;

public class OrdenArray {

	public static void main(String[] args) {
		
		List<Cliente> clis = Cliente.getClientes();
		
		Cliente[] clientes = clis.toArray(new Cliente[] {});
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
		System.out.println("---------");
		
		//Ordenar array
		Arrays.sort(clientes, Cliente.nombreComparator());
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
		System.out.println("---------");
		
		//Ordenar List
		Collections.sort(clis, Cliente.emailComparator());
		for (Cliente cliente : clis) {
			System.out.println(cliente);
		}
	}
}
