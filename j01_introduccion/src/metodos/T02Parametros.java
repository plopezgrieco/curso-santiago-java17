package metodos;

import objetos.arrays.SumaArrays;

public class T02Parametros {
	
	public static void cambia(int a) {
		a = 0;
	}
	
	public static void cambia(int[] v) {
		v = new int[] {0,0,0};
		for (int i = 0; i < v.length; i++) {
			v[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		int a = 55;
		cambia(a);
		System.out.println(a);
		
		int[] m = {55, 55, 55, 55};
		cambia(m);
		System.out.println(SumaArrays.toString(m));
	}
}
