package introduccion;

import java.util.Scanner;

public class T08LecturaTeclado {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Ingresa tu nombre: ");
		String nombre = tec.nextLine();
		
		System.out.println("Hola " + nombre);
		
		System.out.print("Ingresa un valor entero: ");
		int num = tec.nextInt();
		
		System.out.println(num);
		
		
	}
}
