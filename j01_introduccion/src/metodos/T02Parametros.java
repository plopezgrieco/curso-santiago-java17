package metodos;

public class T02Parametros {
	
	public static void cambia(int a) {
		a = 0;
	}
	
	public static void main(String[] args) {
		int a = 55;
		cambia(a);
		System.out.println(a);
	}
}
