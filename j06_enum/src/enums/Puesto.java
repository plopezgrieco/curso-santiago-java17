package enums;

public enum Puesto {
	PILIER_IZQ(1, "Pilier", "Prop"), 
	TALONADOR(2, "Talonador", "Hooker"), 
	PILIER_DERECHO(3, "Pilier", "Prop");
	
	private int dorsal;
	private String nombre;
	private String ingles;
	
	private Puesto(int dorsal, String nombre, String ingles) {
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.ingles = ingles;
	}

	public int getDorsal() {
		return dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public String getIngles() {
		return ingles;
	}
}
