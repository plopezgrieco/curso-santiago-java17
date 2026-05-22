package miscolecciones;

public class Test {
	public static void main(String[] args) {
		ListaEnlazada lista = new ListaEnlazada();
		
		lista.agregar("uno");
		lista.agregar("dos");
		lista.agregar("tres");
		
		String[] datos = lista.toArray();
		
		for (int i = 0; i < datos.length; i++) {
			System.out.println(datos[i]);
		}
	}
}
