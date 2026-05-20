package objetos;

import java.util.Scanner;

public class T01EstaticosInstancia {
	
	int varInstancia;
	static int varEstatica;
	static String algo;
	
	public static void main(String[] args) {
		
		//pow es un método estático
		System.out.println(Math.pow(15, 3));
		
		Scanner tec = new Scanner(System.in);
		
		varEstatica = 4;
//		varInstancia = 88;
		
		saludo();
//		saludoInstancia();
		
		int num;
		String algo;
		
//		num += 0; // num = num + 0;
//		num ++;
//		System.out.println(num);
//		System.out.println(algo);
	}
	
	public static void saludo() {
		System.out.println("Saluda!!!");
	}
	
	public void saludoInstancia() {
		System.out.println("Otro saludo");
		varInstancia = 5;
	}
}
