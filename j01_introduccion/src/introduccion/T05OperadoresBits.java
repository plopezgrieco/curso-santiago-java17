package introduccion;

public class T05OperadoresBits {
	public static void main(String[] args) {
		
		int val = -4;
		
		System.out.println(val << 2);
		
		System.out.println(val >> 1);

		System.out.println(val >>> 1);
		
		int leido = 234354;
		// necesito saber si el tercer bit está encendido
		if ((leido & 4) == 0) // 4 = 0000000000100
			System.out.println("apagado");
	}
}
