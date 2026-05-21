package tests;

import modelo.Figura;
import modelo.Rectangulo;

public class T01 {
	public static void main(String[] args) {
//		Rectangulo r = new Rectangulo();
//		r.x = 1;
//		r.y = 5;
//		r.lado1 = 15;
//		r.lado2 = 7;

		Rectangulo r = new Rectangulo(1, 5, 15, 7);
		
		System.out.println(r.area());
		System.out.println(r.perimetro());
	
//		Figura f = new Figura(); es abstracta, no se puede instanciar
	}
}
