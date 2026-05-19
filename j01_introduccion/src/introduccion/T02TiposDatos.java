package introduccion;

public class T02TiposDatos {
	public static void main(String[] args) {
		
//		float f = 1.5; error de compilación 1.5 es double
		float f1 = 1.5F;
		float f2 = (float)1.5;
		
//		long l = 3_000_000_000;
		long l = 3_000_000_000L;
		
		//operadores sobrecargados
		
		System.out.println(5 + 7); // operandos numéricos suma aritmética
		System.out.println(5 + "7");// si al menos uno de los operadores es String, concatena
		
		double resu = 10 / 3; // si los operadores son enteros, "/" realiza la división entera
		System.out.println(resu);
		
		double otroResu = 10.0 / 3; // si al menos uno es real, "/" realiza la división real
		System.out.println(otroResu);
		
		//Operador de módulo %
		// Calcula el resto de la división entera
		
		int div = 10 / 3; // 3
		int resto = 10 % 3; // 1
		System.out.println(div);
		System.out.println(resto);
		
		//Saber si un número es par???
		int num = 13458;
		
		if (num % 2 == 0)
			System.out.println(num + " es par.");
		else
			System.out.println(num + " es impar.");
		
		//Quiero obtener la unidad de num
		System.out.println(num % 10);
	}
}
