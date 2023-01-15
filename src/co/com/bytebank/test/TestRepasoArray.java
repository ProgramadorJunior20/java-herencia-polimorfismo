package co.com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {
	
	public static void main(String[] args) {
		
		// Todo arreglo nace con tamaño fijo
		int[] numeros = new int[10];
		
		int numero = 40;
		// WRAPPER
		//Integer numeroObjeto = new Integer(40); deprecado
		Integer numeroObjeto = Integer.valueOf(40);
		
		// Una lista acepta a un jenerico como parametro
		// Y la puedo inicializar ya sea como LinkedList, ArrayList o un Vector
		List<Integer> lista = new ArrayList<Integer>(); // Un ArrayList crea la misma estructura que un array
//      primitivo != object 
		lista.add(numero); // autoboxing
		lista.add(Integer.valueOf(40));
		lista.add(numeroObjeto);
		
		// unboxing
		// int ValorPrimitovo = numeroObjeto;
		int ValorPrimitovo = numeroObjeto.intValue();
		
		byte byteInteger = numeroObjeto.byteValue();
		double doubleInteger = numeroObjeto.doubleValue();
		float floatInteger = numeroObjeto.floatValue();
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE); // bist
		System.out.println(Integer.BYTES); // 4
	}
}
