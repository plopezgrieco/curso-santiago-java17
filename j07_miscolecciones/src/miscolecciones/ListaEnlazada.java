package miscolecciones;

public class ListaEnlazada {

	private Nodo primero;
	private Nodo ultimo;
	private int cant;
	
	public void agregar(String dato) {
		Nodo nuevo = new Nodo(dato);
		if(cant == 0) {
			primero = nuevo;
		} else {
			ultimo.siguiente = nuevo;
		}
		ultimo = nuevo;
		cant++;
	}
	
	public String[] toArray() {
		String[] resu = new String[cant];
		Nodo aux = primero;
		int idx = 0;
		while(aux != null) {
			resu[idx++] = aux.dato;
			aux = aux.siguiente;
		}
		return resu;
	}
	
	public int size() {
		return cant;
	}
	
	
	
	private class Nodo {
		String dato;
		Nodo siguiente;
		
		Nodo(String dato) {
			this.dato = dato;
		}
	}
}
