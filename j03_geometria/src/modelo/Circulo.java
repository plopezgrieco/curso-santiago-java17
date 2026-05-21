package modelo;

import print.Pintable;

public class Circulo extends Figura implements Pintable {

	private double radio;
	
	public Circulo() {}
	
	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}
	
	public double area() {
		return Math.PI * radio * radio;
	}
	
	public double perimetro() {
		return 2 * Math.PI * radio;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Circulo otro = (Circulo) o;
		return this.radio == otro.radio;
	}
	
	public String toString() {
		return "Circ[" + getX() + ", " + getY() + ", " + radio + "]";
	}

	@Override
	public void print() {
		System.out.println("soy un circulito!!");
	}
}
