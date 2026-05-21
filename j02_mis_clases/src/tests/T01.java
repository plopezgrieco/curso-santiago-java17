package tests;

import modelo.TrianguloRectangulo;

public class T01 {
	public static void main(String[] args) {
		
		TrianguloRectangulo tr;
		
		tr = new TrianguloRectangulo();
		
		tr.c1 = 30;
		tr.c2 = 40;
		System.out.println(tr.hipotenusa());
		
	}
}
