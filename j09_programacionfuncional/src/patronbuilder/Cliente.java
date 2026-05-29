package patronbuilder;

public class Cliente {

	private String nombre;
	private String apellidos;
	private String domicilio;
	private String email;
	private Double saldo;
	
	private Cliente(String nombre, String apellidos, String domicilio, String email, Double saldo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.domicilio = domicilio;
		this.email = email;
		this.saldo = saldo;
	}
	
	public static Builder builder() {
		return new Builder();
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

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", domicilio=" + domicilio + ", email="
				+ email + ", saldo=" + saldo + "]";
	}


	public static class Builder {
		private String nombre;
		private String apellidos;
		private String domicilio;
		private String email;
		private Double saldo;

		private Builder() {}
		
		public Builder nombre(String nombre) {
			this.nombre = nombre;
			return this;
		}
		public Builder apellidos(String apellidos) {
			this.apellidos = apellidos;
			return this;
		}
		public Builder domicilio(String domicilio) {
			this.domicilio = domicilio;
			return this;
		}
		public Builder email(String email) {
			this.email = email;
			return this;
		}
		public Builder saldo(Double saldo) {
			this.saldo = saldo;
			return this;
		}
		
		public Cliente build() {
			//Validaciones
			return new Cliente(nombre, apellidos, domicilio, email, saldo);
		}
	}

	
}
