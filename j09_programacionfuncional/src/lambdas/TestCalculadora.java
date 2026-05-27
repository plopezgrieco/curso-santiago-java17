package lambdas;

public class TestCalculadora {
	public static void main(String[] args) {
		
//		Calculadora suma = (n1, n2) -> {return n1 + n2;};
		Calculadora suma = (n1, n2) -> n1 + n2;
		Calculadora multiplica = (n1, n2) -> n1 * n2;
		
		System.out.println(suma.opera(4, 8));
		System.out.println(multiplica.opera(4, 8));
		
		calcula(suma);
		calcula((a, b) -> a / b);
	}
	
	
	public static void calcula(Calculadora calc) {
		System.out.println("Resultado: " + calc.opera(8, 17));
	}
}
