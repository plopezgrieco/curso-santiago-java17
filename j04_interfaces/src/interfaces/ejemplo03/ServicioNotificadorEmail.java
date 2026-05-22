package interfaces.ejemplo03;

public class ServicioNotificadorEmail extends Servicio implements Notificador, Auditable, Registrable {

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
	
	@Override
	public void mostrarInfo() {
		System.out.println("Mostrando info desde NotificadorEmail y uso: ");
		super.mostrarInfo();
		Auditable.super.mostrarInfo();
		Registrable.super.mostrarInfo();
	}
}
