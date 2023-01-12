package co.com.bytebank.test;

import co.com.bytebank.modelo.*;

public class TestGuardaReferencias {

	public static void main(String[] args) {

		// Inicializando este objeto normal
		GuardaReferencias guardaCuentas = new GuardaReferencias();

		// Ahora crearemos una cuenta y la guardamos en un metodo adicionar
		Object cc = new CuentaCorriente(11, 22);
		guardaCuentas.adicionar(cc);
		Object cc2 = new CuentaCorriente(22, 11);
		guardaCuentas.adicionar(cc2);
		Object ca = new CuentaAhorros(33, 44);
		guardaCuentas.adicionar(ca);

		System.out.println("Cuenta Corriente: " + guardaCuentas.obtener(0));
		System.out.println("Cuenta Corriente: " + guardaCuentas.obtener(1));
		System.out.println("Cuenta Ahorros: " + guardaCuentas.obtener(2));
	}

}
