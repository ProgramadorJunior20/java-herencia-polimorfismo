package co.com.bytebank.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import co.com.bytebank.modelo.*;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		// ArrayList<Cuenta> Forzando a que acepte solo un tipo de cuenta
		// List<Cliente> listaClientes = new LinkedList<>();
		
		List<Cuenta> lista = new Vector<>();
		// referencia   Objeto -> HEAP
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(13, 42);
		Cuenta cc3 = new CuentaCorriente(11, 22);
		
		lista.add(cc);
		lista.add(cc2);
		
		Cuenta obtenerCuenta = lista.get(1);
		System.out.println(obtenerCuenta);
		
		//for(int i = 0; i < lista.size(); i++) {
		//	System.out.println(lista.get(i));
		//}
		
		//                 en la
		// Por cada cuenta : lista
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		boolean contiene = lista.contains(cc3);
		// Por referencia
		if ( contiene ) {
			System.out.println("Si, es igual (equals)");
		}
		
	}
}
