package interfaces.ejemplo03;

public interface Auditable {

	default void mostrarInfo() {
		System.out.println("Info de Auditable");
	}
}
