package co.com.bytebank.test;

public class TestMain {
	
	public static void main(String[] args) {
		
		int edad = 15;
		int edad2 = 20;
		int edad3 = 25;
		
		// Quiero agruparlas en la una sola referencia
		
		// indices           0   1   2    3    4 - los indices en programación siempre comienzan en 0
		// array           [ 0 | 0 | 0 | 30 | 0 ] = 5 posiciones reservadas en memoria para los indices -
		// - y si no les insertas valores se inicializaran siempre en 0
		int[] edades = new int[5];
		edades[3] = 30;
		
		System.out.println(edades[3]);
		System.out.println(edades[0]);
		//System.out.println(edades[5]);
		
		int tamanoArray = edades.length;
		System.out.println("Tamaño Array: " + tamanoArray);
		System.out.println("------------------");
		for(int i = 0; i < tamanoArray; i++) {
			System.out.println(edades[i]);
		}
	}

}
