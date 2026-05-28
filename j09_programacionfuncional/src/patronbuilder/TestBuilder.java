package patronbuilder;

public class TestBuilder {
	public static void main(String[] args) {
		Cliente c = Cliente.builder()
			.nombre("Pepe")
			.email("dddd@dkdkdkd")
			.saldo(175.65)
			.build();
		
		System.out.println(c);
	}
}
