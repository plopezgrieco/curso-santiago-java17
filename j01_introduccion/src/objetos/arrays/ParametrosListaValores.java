package objetos.arrays;

public class ParametrosListaValores {

//	public static int suma(int n1, int n2) {
//		return n1 + n2;
//	}
//	
//	public static int suma(int n1, int n2, int n3) {
//		return n1 + n2 + n3;
//	}
	
	public static int suma(int... v) {
		int suma = 0;
		for (int i = 0; i < v.length; i++) {
			suma += v[i];
		}
		return suma;
	}
	
	public static void main(String[] args) {
		System.out.println(suma(3, 6));
		System.out.println(suma(3, 6, 9));
		System.out.println(suma(new int[] {5, 8, 66, 8}));
	}
}