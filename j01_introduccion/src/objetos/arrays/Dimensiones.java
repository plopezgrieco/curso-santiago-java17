package objetos.arrays;

public class Dimensiones {
	
	public static void main(String[] args) {
		
//		int[][] m = new int[3][4];
		int[][] m = {{1,2,3,4}, {5,6,7,8,9,11,15}, {9,8,7,6}};
		System.out.println(m.length);
		System.out.println(m[0].length);
		System.out.println(m[1].length);
		
		//quiero mostrar el 15
		System.out.println(m[1][6]);
		
		//recorrido completo
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
