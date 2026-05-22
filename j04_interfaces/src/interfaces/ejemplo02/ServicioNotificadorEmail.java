package interfaces.ejemplo02;

public class ServicioNotificadorEmail implements Notificador {

	@Override
	public void enviar(String mensaje) {
		System.out.println("Enviando email: " + mensaje);
	}

	//Esta sobreescritura es opcional
	@Override
	public void enviarBienvenida(int modo) {
		System.out.println("Preparando bienvenida al email ...");
		Notificador.super.enviarBienvenida(modo);
	}
	
}
