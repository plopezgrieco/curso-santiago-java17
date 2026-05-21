package tests;

import modelo.Circulo;
import otro.Persona;
import print.Pintable;

public class T03 {
	public static void main(String[] args) {
		Pintable[] prints = new Pintable[2];
		
		prints[0] = new Circulo();
		prints[1] = new Persona(55);
		
		for (int i = 0; i < prints.length; i++) {
			prints[i].print();
		}
	}
}
