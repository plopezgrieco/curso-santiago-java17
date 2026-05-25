package colecciones.genericos;

public class WilcardGeneric {

	//Unbounded wilcard
	//No se puede modificar porque se desconoce el tipo
	public static void muestraLista(Lista<?> lista) {
		for (int i = 0; i < lista.largo(); i++)
			System.out.println(lista.buscar(i));
	}
	
	//Upper bounded wildcard (comodín con límite superior)
	//No se puede modificar porque se desconoce el tipo
	public static void procesaNumeros(Lista<? extends Number> nums) {
		double total = 0;
		for (int i = 0; i < nums.largo(); i++)
			total += nums.buscar(i).doubleValue();
		
		System.out.println(total);
	}
	
	//Lower bounded wilcard (comodín con límite inferior)
	//Permite modificaciones
	public static void actualizaNumeros(Lista<? super Integer> nums) {
		nums.agregar(2345);
		nums.agregar(1234567);
		for (int i = 0; i < nums.largo(); i++)
			System.out.println(nums.buscar(i));
	}
	
	public static void main(String[] args) {
		Lista<Integer> ints = new ListaEnlazada<Integer>();
		ints.agregar(155);
		ints.agregar(6);
		ints.agregar(60);
		
		procesaNumeros(ints);
		
		muestraLista(ints);
		
		actualizaNumeros(ints);
		
	}
}
