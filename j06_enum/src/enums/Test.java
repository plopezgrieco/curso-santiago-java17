package enums;

public class Test {
	public static void main(String[] args) {
		muestraMes(Mes.JUNIO);
		muestraPuesto(Puesto.TALONADOR);
	}
	
	public static void muestraMes(Mes mes) {
		System.out.println(mes);
		System.out.println(mes.ordinal());
	}
	
	public static void muestraPuesto(Puesto puesto) {
		System.out.println(puesto);
		System.out.println(puesto.getDorsal());
		System.out.println(puesto.getNombre());
		System.out.println(puesto.getIngles());
	}
}
