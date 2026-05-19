package metodos;

public class T01Sobrecarga {

	public static int suma(int a, int b) {  // firma:    suma(int,int)
		return a + b;
	}
	
	//sume dos double
	public static double suma(double a, double b) { //    suma(double,double)
		return a + b;
	}
	
	public static int suma(int a, int b, int c) {  // firma:    suma(int,int,int)
		return a + b + c;
	}
	
//	public static int suma(int ...nums) {
//		return 0;
//	}
}
