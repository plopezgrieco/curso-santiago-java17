package sets;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {
	private int id;
	private String nombre;
	private String apellidos;
	private String email;
	
	public Cliente() {
	}

	public Cliente(int id, String nombre, String apellidos, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return id == other.id;
	}
	
	public static List<Cliente> getClientes() {
		List<Cliente> listaClientes = new ArrayList<>();

        listaClientes.add(new Cliente(1, "Alejandro", "García Pérez", "alejandro.garcia@email.com"));
        listaClientes.add(new Cliente(2, "María", "Rodríguez Martínez", "maria.rodriguez@email.com"));
        listaClientes.add(new Cliente(3, "Carlos", "López Sánchez", "carlos.lopez@email.com"));
        listaClientes.add(new Cliente(4, "Ana", "González Gómez", "ana.gonzalez@email.com"));
        listaClientes.add(new Cliente(5, "Luis", "Fernández Díaz", "luis.fernandez@email.com"));
        listaClientes.add(new Cliente(6, "Laura", "Torres Ruiz", "laura.torres@email.com"));
        listaClientes.add(new Cliente(7, "Javier", "Ramírez Jiménez", "javier.ramirez@email.com"));
        listaClientes.add(new Cliente(8, "Elena", "Vázquez Moreno", "elena.vazquez@email.com"));
        listaClientes.add(new Cliente(9, "Diego", "Muñoz Muñoz", "diego.munoz@email.com"));
        listaClientes.add(new Cliente(10, "Sofía", "Alonso Hernández", "sofia.alonso@email.com"));
        listaClientes.add(new Cliente(11, "Manuel", "Romero Romero", "manuel.romero@email.com"));
        listaClientes.add(new Cliente(12, "Carmen", "Navarro Rubio", "carmen.navarro@email.com"));
        listaClientes.add(new Cliente(13, "Pablo", "Torres Torres", "pablo.torres@email.com"));
        listaClientes.add(new Cliente(14, "Lucía", "Domínguez Sosa", "lucia.dominguez@email.com"));
        listaClientes.add(new Cliente(15, "Álvaro", "Vargas Ramos", "alvaro.vargas@email.com"));
        listaClientes.add(new Cliente(16, "Marta", "Castro Ortiz", "marta.castro@email.com"));
        listaClientes.add(new Cliente(17, "David", "Morales Gil", "david.morales@email.com"));
        listaClientes.add(new Cliente(18, "Irene", "Delgado Flores", "irene.delgado@email.com"));
        listaClientes.add(new Cliente(19, "Hugo", "Morales Blanco", "hugo.morales@email.com"));
        listaClientes.add(new Cliente(20, "Paula", "Marín Serrano", "paula.marin@email.com"));
        listaClientes.add(new Cliente(21, "Jorge", "Ortega Molina", "jorge.ortega@email.com"));
        listaClientes.add(new Cliente(22, "Sara", "Delgado Morales", "sara.delgado@email.com"));
        listaClientes.add(new Cliente(23, "Andrés", "Marín Delgado", "andres.marin@email.com"));
        listaClientes.add(new Cliente(24, "Raquel", "Nuñez Medina", "raquel.nunez@email.com"));
        listaClientes.add(new Cliente(25, "Francisco", "Asensio Cruz", "francisco.asensio@email.com"));
        listaClientes.add(new Cliente(26, "Beatriz", "Calvo Bravo", "beatriz.calvo@email.com"));
        listaClientes.add(new Cliente(27, "Santiago", "Gallego Benítez", "santiago.gallego@email.com"));
        listaClientes.add(new Cliente(28, "Julia", "Vidal Vidal", "julia.vidal@email.com"));
        listaClientes.add(new Cliente(29, "Adrián", "Campos Vega", "adrian.campos@email.com"));
        listaClientes.add(new Cliente(30, "Patricia", "Fuentes Rey", "patricia.fuentes@email.com"));
        return listaClientes;
	}
}
