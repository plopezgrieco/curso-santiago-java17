package introduccion;

import java.util.Scanner;

public class T10LecturaTeclado3 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Ingresa primer valor: ");
		double num1 = tec.nextDouble();
		tec.nextLine(); //limpieza buffer
		
		System.out.print("Ingresa segundo valor: ");
		double num2 = tec.nextDouble();
		tec.nextLine(); //limpieza buffer
		
		System.out.print("Ingresa operacion: ");
		String operacion = tec.nextLine();
		
		System.out.println(num1 + operacion + num2);


	}
}
