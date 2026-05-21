package tests;

import modelo.Circulo;
import modelo.Figura;
import modelo.Rectangulo;

public class T02 {
	
	public static void main(String[] args) {
		Figura[] figs = new Figura[5];
		figs[0] = new Rectangulo(1,2,3,4);
		figs[1] = new Rectangulo(5,6,7,8);
		figs[2] = new Circulo(1, 2, 3);
		figs[3] = new Circulo(1, -2, 10);
		figs[4] = new Circulo(-1, 2, 2.5);
		
		System.out.println(sumaAreas(figs));
		
		Rectangulo nuevo = new Rectangulo(5,6,7,8);
		
		System.out.println(nuevo.equals(figs[1]));
		
		System.out.println(nuevo);
	}
	
	public static double sumaAreas(Figura... figuras) {
		double suma = 0;
		for (int i = 0; i < figuras.length; i++) {
			suma += figuras[i].area();
			if (figuras[i] instanceof Circulo) {
				Circulo c = (Circulo) figuras[i];
				System.out.println(c.getRadio());
			}
		}
		return suma;
	}

	//Metodo equals de la clase Object
	public boolean equals(Object o) {
		return this == o;
	}
	
}
