package metodos;

public class T03Factorial {
	
	public static long factorialIter(int n) {
		long factorial = 1;
		for (int i = n; i >= 1; i--) {
			factorial *= i;
		}
		return factorial;
	}
	
	public static long factorialRec(int n) {
		if (n == 0) return 1;
		return n * factorialRec(n - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(factorialIter(25));
		System.out.println(factorialRec(25));
	}
}
