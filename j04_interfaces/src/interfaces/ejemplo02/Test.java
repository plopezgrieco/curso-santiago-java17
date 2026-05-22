package interfaces.ejemplo02;

public class Test {
	public static void main(String[] args) {
		String mensaje = "   curso de java   ";
		
		if (Notificador.mensajeValido(mensaje)) {
			String normalizado = Notificador.normalizar(mensaje);
			
			ServicioNotificadorEmail email = new ServicioNotificadorEmail();
			
			email.enviar(normalizado);
			email.enviarBienvenida(Notificador.FORMAL);
			
		}
	}
}
