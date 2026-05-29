package streams;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Stream06Parallel {
	public static void main(String[] args) {
		System.out.println("Procesadores: " + Runtime.getRuntime().availableProcessors());
		System.out.println("Memoria total: " + Runtime.getRuntime().totalMemory() * 1e-6 + "Mb");
		System.out.println("Memoria maxima: " + Runtime.getRuntime().maxMemory() * 1e-6 + "Mb");
		
		System.out.println("Generar aleatorios");
		final int CANT = 80_000_000;
		List<Integer> lista = 
			Stream.generate(() -> new Random().nextInt(10000)).limit(CANT).toList();
		System.out.println("Generados " + lista.size() + " valores");
		
		System.out.println("Proceso secuencial");
		long t0, tf;
		t0 = System.currentTimeMillis();
		List<Integer> sec = 
			lista.stream()
			.filter(n -> Math.log(n) > 8)
			.toList();
		tf = System.currentTimeMillis();
		System.out.println("Seq: " + (tf - t0));

		System.out.println("Proceso secuencial");
		t0 = System.currentTimeMillis();
		List<Integer> p = 
				lista.parallelStream()
				.filter(n -> Math.log(n) > 8)
				.toList();
		tf = System.currentTimeMillis();
		System.out.println("Parallel: " + (tf - t0));
		
		t0 = System.currentTimeMillis();
		List<Integer> forEach = new ArrayList<Integer>();
//		List<Integer> forEach = new LinkedList<Integer>();
		
		for (Integer num : lista) {
			if (Math.log(num) > 8)
				forEach.add(num);
		}
		tf = System.currentTimeMillis();
		System.out.println("ForEach: " + (tf - t0));
	}
}
