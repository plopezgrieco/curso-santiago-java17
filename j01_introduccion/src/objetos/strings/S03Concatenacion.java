package objetos.strings;

public class S03Concatenacion {
	public static void main(String[] args) {
		
		String s = "";
		StringBuilder sb = new StringBuilder(); //no soporta threads
		StringBuffer sbf = new StringBuffer(); //soporta threads
		
		long t0 = System.currentTimeMillis();
//		for (int i = 1; i <= 400_000; i++) {
//			s += "a";
//		}
		long tf = System.currentTimeMillis();
//		System.out.println("String: " + (tf-t0));
		
		t0 = System.currentTimeMillis();
		for (int i = 1; i <= 5_000_000; i++) {
			sb.append("a");
		}
		tf = System.currentTimeMillis();
		System.out.println("StringBuilder: " + (tf-t0));
		
		t0 = System.currentTimeMillis();
		for (int i = 1; i <= 5_000_000; i++) {
			sbf.append("a");
		}
		tf = System.currentTimeMillis();
		System.out.println("StringBuffer: " + (tf-t0));
		
	}
}
