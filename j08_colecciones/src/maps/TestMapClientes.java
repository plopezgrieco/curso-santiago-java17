package maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import sets.Cliente;

public class TestMapClientes {

	public static void main(String[] args) {
		
		Map<Integer, Cliente> clientes = new HashMap<Integer, Cliente>();
		
		for (Cliente cli : Cliente.getClientes()) {
			clientes.put(cli.getId(), cli);
		}
		
		System.out.println(clientes.get(28));
		
		for (Map.Entry<Integer, Cliente> entry : clientes.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println("--------");
		
		Map<String, Cliente> cliEmails = new HashMap<String, Cliente>();
		for (Cliente cli : clientes.values()) {
			cliEmails.put(cli.getEmail(), cli);
		}
		
		System.out.println(cliEmails.get("irene.delgado@email.com"));
	}
}
