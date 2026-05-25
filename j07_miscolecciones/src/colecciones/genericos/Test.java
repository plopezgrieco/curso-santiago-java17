package colecciones.genericos;

public class Test {

	public static void main(String[] args) {
		ListaArray<Integer> listaNum = new ListaArray<>();
		listaNum.agregar(122);
		listaNum.agregar(55);
		listaNum.agregar(18);
		procesaLista(listaNum);
	}
	
	
	public static void procesaLista(Lista<?> miLista) {
//		miLista.agregar(999);
		for (int i = 0; i < miLista.largo(); i++)
			System.out.println(miLista.buscar(i));
	}
	
}
