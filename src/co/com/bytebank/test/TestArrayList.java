package co.com.bytebank.test;

import java.util.ArrayList;

import co.com.bytebank.modelo.*;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		// ArrayList<Cuenta> Forzando a que acepte solo un tipo de cuenta
		ArrayList<Cuenta> lista = new ArrayList<>();
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(13, 42);
		
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
		
	}
}
