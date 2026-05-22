package interfaces.ejemplo04;

public interface Auditable {

	default void mostrarInfo() {
		System.out.println("Info de Auditable");
	}
}
