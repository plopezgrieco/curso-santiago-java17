package interfaces.ejemplo04;

public interface Notificador {

	//Por defecto son public static final
	//No puede haber otro tipo de atributos
	public static final int FORMAL = 1;
	int INFORMAL = 2;
	
	//public abstract
	void enviar(String mensaje);
	
	default void enviarBienvenida(int modo) {
		switch(modo) {
		case FORMAL -> enviar(formatear("Bienvenido al Sistema"));
		case INFORMAL -> enviar(formatear("Hola amigo"));
		}
	}
	
	static boolean mensajeValido(String mensaje) {
		return mensaje != null && !mensaje.isBlank();
	}
	
	private String formatear(String mensaje) {
		return "[NOTIFICACIÓN] " + mensaje;
	}
	
	static String normalizar(String mensaje) {
		return limpiarEspacios(mensaje).toUpperCase();
	}
	
	private static String limpiarEspacios(String mensaje) {
		return mensaje.trim();
	}
	
}
