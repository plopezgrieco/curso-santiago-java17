package streams;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream05TerminalesColectores {
	public static void main(String[] args) {
		List<Empleado> emps = Empleado.getEmpleados();
		emps.forEach(System.out::println);
		
		//Generar una lista con los nombres
		List<String> nombres = 
			emps.stream()
			.map(Empleado::getNombre)
			.collect(Collectors.toList());
		nombres.forEach(System.out::println);
		System.out.println(nombres.getClass().getName() + "\n");
		
		//Generar un TreeSet con los apellidos
		Set<String> nifs = 
				emps.stream()
				.map(Empleado::getNif)
				.collect(Collectors.toCollection(TreeSet::new));
		nifs.forEach(System.out::println);
		System.out.println(nifs.getClass().getName() + "\n");
		
		//Generar una cadena con los apellidos separados por "-"
		String apellidos = 
				emps.stream()
				.map(Empleado::getApellido1)
				.collect(Collectors.joining(" - "));
		System.out.println(apellidos + "\n");
		
		//Usar el método muestraStream
		muestraStream(emps.stream().map(e -> e.getApellido1() + " " + e.getApellido2()));
		
		//Agrupar Empleados por Departamento
		Map<Departamento, List<Empleado>> empsPorDpto = 
			emps.stream()
			.collect(Collectors.groupingBy(Empleado::getDepartamento));
		empsPorDpto.forEach((d, em) -> System.out.println(d + ": " + em));
		System.out.println();
		
		//Media de salarios por Departamento
		Map<String, Double> salariosPrDpto =
			emps.stream()
			.collect(Collectors.
				groupingBy(e -> e.getDepartamento().getDepartamento(), 
						   Collectors.averagingDouble(Empleado::getSalario)
				)
			);
		salariosPrDpto.forEach((d, s) -> System.out.println(d + ": €" + s));
		
		//Particion de empleados entre sueldos bajos y altos
		double salarioMedio = 1600;
		Map<Boolean, List<Empleado>> salariosBajos = 
			emps.stream()
			.collect(Collectors.partitioningBy(e -> e.getSalario() < salarioMedio));
		salariosBajos.forEach((b, l) -> System.out.println((b?"Bajos: ":"Altos: ") + l));
		
		//Resumen estádistico de salarios
		DoubleSummaryStatistics st = 
			emps.stream()
			.collect(Collectors.summarizingDouble(Empleado::getSalario));
		System.out.println(st);
		
	}
	
	public static void muestraStream(Stream<String> str) {
		System.out.println(str.collect(Collectors.joining(", ", "[", "]")));
	}
}
