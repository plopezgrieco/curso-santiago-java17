package ejercicios;

public class Ej0502Palindromo {
	
	public static void main(String[] args) {
//		System.out.println(invierte("Esto es una frase"));
		System.out.println(esPalindromo("algo"));
		System.out.println(esPalindromo("Dabale arroz a la zorra el abad"));
		System.out.println(esPalindromo2("algo"));
		System.out.println(esPalindromo2("Dabale arroz a la zorra el abad"));
	}
	
	public static String invierte(String frase) {
		String inv = "";
		frase = limpiaFrase(frase);
		for (int i = frase.length() - 1; i >= 0; i--) {
			inv += frase.charAt(i);
		}
		return inv;
	}
	
	public static boolean esPalindromo(String frase) {
		return limpiaFrase(frase).equals(invierte(frase));
	}
	
	public static boolean esPalindromo2(String frase) {
		frase = limpiaFrase(frase);
		boolean esPalindromo = true;
		int i = 0, d = frase.length() -1;
		while(i < d && esPalindromo) {
			if (frase.charAt(i) != frase.charAt(d))
				esPalindromo = false;
			i++; d--;
		}
		return esPalindromo;
	}
	
	public static String limpiaFrase(String frase) {
		return frase.replace(" ", "").toLowerCase();
	}
}
