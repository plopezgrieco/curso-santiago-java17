package clasesinternas;

public class Coche {

	String marca;
	String modelo;
	Motor motor;

	public static class Motor {
		
		private String potencia;
		private int cilindros;
		
		public Motor() {};
		
		public Motor(String potencia, int cilindros) {
			super();
			this.potencia = potencia;
			this.cilindros = cilindros;
		}

		public String getPotencia() {
			return potencia;
		}

		public void setPotencia(String potencia) {
			this.potencia = potencia;
		}

		public int getCilindros() {
			return cilindros;
		}

		public void setCilindros(int cilindros) {
			this.cilindros = cilindros;
		}
		
		
		
	}
	
	
}
