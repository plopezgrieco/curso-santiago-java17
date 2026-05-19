package introduccion;

public class T04OperadoresLogicos {
	public static void main(String[] args) {
		
		int a = 0, b = 55;
		
		// && o || funcionan con corto circuito
		// en cuanto descubre el valor de la expresión dejan de evaluar
		// & y | evalúan toda la expresión
		
		if (a != 0 && b++ == 55) { // no incrementa b, porque a!=0 es falso
			System.out.println();
		}
		
		if (a != 0 & b++ == 55) { // si lo incrementa, está forzado
			System.out.println();
		}
		
		System.out.println(b);
	}
}
