package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		List<String> ll = new LinkedList<String>();
		final int cant = 200_000;
		cargaLista(al, cant);
		cargaLista(ll, cant);
		long t0, tf;
		
		t0 = System.currentTimeMillis();
//		recorre(al);
//		recorreIterator(al);
		recorreForEach(al);
		tf = System.currentTimeMillis();
		System.out.println("ArrayList: " + (tf - t0));
		
		t0 = System.currentTimeMillis();
//		recorre(ll);
//		recorreIterator(ll);
		recorreForEach(ll);
		tf = System.currentTimeMillis();
		System.out.println("LinkedList: " + (tf - t0));
	}
	
	public static void recorre(List<String> lista) {
		String str;
		for (int i = 0; i < lista.size(); i++) {
			str = lista.get(i);
			//hacemos cosas con str
		}
	}
	
	public static void recorreIterator(List<String> lista) {
		String str;
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			str = it.next();
			//hacemos cosas con str
		}
	}
	
	public static void recorreForEach(List<String> lista) {
		for(String str: lista) {
			//hacemos cosas con str
		}
	}
	
	public static void cargaLista(List<String> lista, int cant) {
		for (int i = 1; i <= cant; i++) {
			lista.add("hola " + i);
		}
	}
}
