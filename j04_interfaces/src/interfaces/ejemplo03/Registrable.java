package interfaces.ejemplo03;

public interface Registrable {

	default void mostrarInfo() {
		System.out.println("Info de Registrable");
	}
}
