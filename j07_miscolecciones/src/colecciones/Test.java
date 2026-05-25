package colecciones;

public class Test {

	public static void main(String[] args) {
		ListaArray la = new ListaArray();
		la.agregar("primer dato");
		la.agregar("segundo dato");
		la.agregar("tercer dato");
		la.agregar("cuarto dato");
		procesaLista(la);
		
		ListaEnlazada le = new ListaEnlazada();
		le.agregar("uno");
		le.agregar("dos");
		le.agregar("tres");
		procesaLista(le);
	}
	
	public static void procesaLista(Lista miLista) {
		miLista.agregar("ultimo dato");
		for (int i = 0; i < miLista.largo(); i++)
			System.out.println(miLista.buscar(i));
	}
}
