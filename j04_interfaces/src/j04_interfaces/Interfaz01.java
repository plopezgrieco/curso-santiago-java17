package j04_interfaces;

//@FunctionalInterface
public interface Interfaz01 {

	void metodoAbstracto();
	
	void algo();
	
	public static void metodoEstatico() {
		System.out.println("Soy un método estático");
	}
	
	public default void metodoDefault() {
		System.out.println("soy un método default");
		System.out.println(metodoPrivado());
	}
	
	private String metodoPrivado() {
		return "soy privado";
	}
}
