package introduccion;

import java.util.Scanner;

public class T09LecturaTeclado2 {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Ingresa frase: ");
		String frase = tec.nextLine();
		
		System.out.println(frase);
		
		System.out.println("Ingresa palabra: ");
		String palabra = tec.next();
		
		System.out.println(palabra);
	}
}
