package estructurascontrol;

public class T02SwitchExpression {
	public static void main(String[] args) {
		
		int dia = 4;
		String nombreDia;
		
		nombreDia = switch(dia) {
		case 1 -> "Lunes";
		case 2 -> "Martes";
		case 3 -> "Miércoles";
		case 4 -> "Jueves";
		case 5 -> {
			System.out.println("Al fin es viernes!!!"); 
			yield "Viernes";
		}
		case 6 -> "Sábado";
		case 7 -> "Domingo";
		default -> "ERROR";
		};
		
		System.out.println(nombreDia);
	}
}
