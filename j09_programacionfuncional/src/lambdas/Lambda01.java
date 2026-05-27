package lambdas;

public class Lambda01 {
	public static void main(String[] args) {
		
		MiInterfazFuncional mif = new MiInterfazFuncional() {
			@Override
			public void haceAlgo() {
				System.out.println("Hola Mundo!!!");
			}
		};
		mif.haceAlgo();
		
		MiInterfazFuncional mif2 = () -> System.out.println("Hola Mundo Funcional");
		mif2.haceAlgo();
		
	}
}
