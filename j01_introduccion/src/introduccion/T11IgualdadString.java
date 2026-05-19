package introduccion;

import java.util.Scanner;

public class T11IgualdadString {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
//		System.out.print("Ingresa nombre: ");
//		String nombre = tec.nextLine();

		String nombre = "pepe";
		
		System.out.println(nombre == "pepe");
		
		System.out.println(nombre.equals("pepe"));
		
		System.out.println("pepe".toUpperCase());
		// "pepe" es un objeto de la clase String
	}
}
