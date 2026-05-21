package otro;

import java.util.Objects;

import modelo.Figura;

public class Rombo extends Figura {

	double dMayor;
	double dMenor;
	
	public Rombo(double dMayor, double dMenor) {
		super();
		this.dMayor = dMayor;
		this.dMenor = dMenor;
	}

	public Rombo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getdMayor() {
		return dMayor;
	}

	public void setdMayor(double dMayor) {
		this.dMayor = dMayor;
	}

	public double getdMenor() {
		return dMenor;
	}

	public void setdMenor(double dMenor) {
		this.dMenor = dMenor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(dMayor, dMenor);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rombo other = (Rombo) obj;
		return Double.doubleToLongBits(dMayor) == Double.doubleToLongBits(other.dMayor)
				&& Double.doubleToLongBits(dMenor) == Double.doubleToLongBits(other.dMenor);
	}

	@Override
	public String toString() {
		return "Rombo [dMayor=" + dMayor + ", dMenor=" + dMenor + "]";
	}
	
	


}
