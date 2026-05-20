package objetos.arrays;

import java.util.Iterator;

public class SumaArrays {
	
	public static String toString(int[] v) {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < v.length - 1; i++) {
			sb.append(v[i] + ", ");
		}
		if (v.length > 0)
			sb.append(v[v.length - 1]);
		
		sb.append("]");
		return sb.toString();
	}
	
	public static int[] suma(int[] v1, int[] v2) {
		int[] largo, corto, resu;
		if (v1.length > v2.length) {
			largo = v1;
			corto = v2;
		} else {
			largo = v2;
			corto = v1;
		}
		resu = new int[largo.length];
		for (int i = 0; i < corto.length; i++) {
			resu[i] = corto[i] + largo[i];
		}
		for (int i = corto.length; i < resu.length; i++) {
			resu[i] = largo[i];
		}
		return resu;
	}
	
	public static void main(String[] args) {
		int[] v1 = {1,2,3,4,5,6};
		int[] v2 = {1,2,3};
		
		System.out.println(toString(v1));
		System.out.println(toString(v2));
		System.out.println(toString(suma(v1, v2)));
		System.out.println(toString(suma(v2, v1)));
	}
}
