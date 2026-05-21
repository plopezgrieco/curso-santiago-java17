package modelo;

public class Persona extends Ente {

	int id;
	String nombre;
	String apellidos;
	String domicilio;
	String telefono;
	
	public Persona(int id) {
//		super();
		this.id = id;
	}
	
	public Persona(int id, String nombre) {
		this(id);
		this.nombre = nombre;
	}
	
	public Persona(int id, String nombre, String apellidos) {
		this(id, nombre);
		this.apellidos = apellidos;
	}
	
	
}
