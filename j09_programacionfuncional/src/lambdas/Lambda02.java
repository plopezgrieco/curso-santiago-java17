package lambdas;

import model.Cliente;

public class Lambda02 {
	public static void main(String[] args) {
		MiInterfazFuncioan2 mif2 = new MiInterfazFuncioan2() {
			@Override
			public void procesa(Cliente c) {
				System.out.println(c.getNombreCompleto());
			}
		};
		Cliente nuevo = new Cliente(15, "Pedro", "Perez", "pp@gmail.com");
		
		mif2.procesa(nuevo);
		
		MiInterfazFuncioan2 mif2l = c -> System.out.println(c.getEmail());
		mif2l.procesa(nuevo);
		
		MiInterfazFuncioan2 mif2l2 = (c) -> {System.out.println(c.getEmail());};
		mif2l.procesa(nuevo);
	}
}
