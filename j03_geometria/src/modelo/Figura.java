package modelo;

import java.util.Objects;

public abstract class Figura extends Object {
	
	private double x;
	private double y;

	public Figura() {
		super();
	}
	
	public Figura(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public abstract double area();
	
	public abstract double perimetro();
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}
	
//	public boolean equals(Object o) {
//		if (o == null) return false;
//		if (o == this) return true;
//		if (o.getClass() != this.getClass()) return false;
//		Figura otra = (Figura) o;
//		return this.x == otra.x && this.y == otra.y;
//	}
	
	
}
