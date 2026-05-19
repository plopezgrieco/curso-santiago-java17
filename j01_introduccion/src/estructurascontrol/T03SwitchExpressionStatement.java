package estructurascontrol;

public class T03SwitchExpressionStatement {
	public static void main(String[] args) {
		
		int dia = 4;
		
		switch(dia) {
		case 1 -> System.out.println("Lunes");
		case 2 -> System.out.println("Martes");
		case 3 -> System.out.println("Miércoles");
		case 4 -> System.out.println("Jueves");
		case 5 -> System.out.println("Viernes"); 
		case 6 -> System.out.println("Sábado");
		case 7 -> System.out.println("Domingo");
		default -> System.out.println("ERROR");
		}
		
	}
}
