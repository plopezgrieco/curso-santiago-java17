package introduccion;

public class T07OperadorCondicional {
	public static void main(String[] args) {
		
		int num = 4561;
		
		String resu;
		
		if (num % 2 == 0)  // condicion
			resu = " es par";  // resultado si es V
		else
			resu = " es impar";  // resultado se es F
		
		 System.out.println(num + resu);
		
		//Con operador condicional
		 
		resu = num % 2 == 0 ? " es par" : " es impar";
		
		System.out.println(num + resu);
	}
}
