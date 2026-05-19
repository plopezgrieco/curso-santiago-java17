package ejercicios;

import java.util.Scanner;

//De una lista de n números ingresados por teclado, imprimir el mayor y el menor valor.
public class Ej0204 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double mayor, menor;
		
		System.out.print("Ingrese cantidad de valores a procesar: ");
		int cant = tec.nextInt();
		
		System.out.print("Ingrese valor: ");
		double num = tec.nextDouble();
		mayor = menor = num;
		
		for (int i = 2; i <= cant; i++) {
			System.out.print("Ingrese valor: ");
			num = tec.nextDouble();
			if (num > mayor)
				mayor = num;
			if (num < menor)
				menor = num;
		}
		
		System.out.println("Mayor: " + mayor);
		System.out.println("Menor: " + menor);
	}
}
