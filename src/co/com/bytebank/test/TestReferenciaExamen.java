package co.com.bytebank.test;

import co.com.bytebank.modelo.*;

public class TestReferenciaExamen {
	
	public static void main(String[] args) {
		
		CuentaAhorros[] cuentas = new CuentaAhorros[10];
		CuentaAhorros ca1 = new CuentaAhorros(11,22);
		CuentaAhorros ca2 = new CuentaAhorros(33,44);
		cuentas[0] = ca1;
		cuentas[1] = ca1;
		cuentas[4] = ca2;
		cuentas[5] = ca2;
		CuentaAhorros ref1 = cuentas[1];
		CuentaAhorros ref2 = cuentas[4];
		
		for ( int i = 0; i < cuentas.length; i++) {
			System.out.println(cuentas[i]);
		}
		
	}

}
