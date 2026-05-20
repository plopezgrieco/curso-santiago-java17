package objetos.strings;

public class S01Igualdad {
	public static void main(String[] args) {
		
		int a = 55;
		int b = 55;
		System.out.println(a == b);
		
		String s1 = "hola";
		String s2 = new String("hola");
		System.out.println(s1 == s2); //compara el contenido, direcciones de memoria
		
		String s3 = "Hola".toLowerCase();
		System.out.println(s1 == s3);

		s3 += ".";
		System.out.println(s1);
		System.out.println(s3);
		
		System.out.println(s1.equals(s2));
	}
}
