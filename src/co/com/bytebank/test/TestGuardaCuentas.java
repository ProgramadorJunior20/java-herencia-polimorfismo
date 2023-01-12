package co.com.bytebank.test;

import co.com.bytebank.modelo.Cuenta;
import co.com.bytebank.modelo.CuentaAhorros;
import co.com.bytebank.modelo.CuentaCorriente;
import co.com.bytebank.modelo.GuardaCuentas;

public class TestGuardaCuentas {
	
	public static void main(String[] args) {
		
		// Inicializando este objeto normal
		GuardaCuentas guardaCuentas = new GuardaCuentas();
		
		// Ahora crearemos una cuenta y la guardamos en un metodo adicionar
		Cuenta cc = new CuentaCorriente(11, 22);
		guardaCuentas.adicionar(cc);
		Cuenta cc2 = new CuentaCorriente(22, 11);
		guardaCuentas.adicionar(cc2);
		Cuenta ca = new CuentaAhorros(33, 44);
		guardaCuentas.adicionar(ca);
		
		System.out.println("Cuenta Corriente: " + guardaCuentas.obtener(0));
		System.out.println("Cuenta Corriente: " + guardaCuentas.obtener(1));
		System.out.println("Cuenta Ahorros: " + guardaCuentas.obtener(2));
		
	}
}
