package interfaces.ejemplo04;

public interface Registrable {

	default void mostrarInfo() {
		System.out.println("Info de Registrable");
	}
}
