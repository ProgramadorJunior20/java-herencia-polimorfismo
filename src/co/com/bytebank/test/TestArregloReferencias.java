package co.com.bytebank.test;

import co.com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {
	
	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente(23, 44);
		
		CuentaCorriente[] cuentas = new CuentaCorriente[5];
		cuentas[1] = cc;
		
		System.out.println(cc);
		System.out.println("Array Cuentas: " + cuentas[1]);
		
		cuentas[0] = new CuentaCorriente(22, 33);
		System.out.println("Array Cuentas: " + cuentas[0]);
		
		for(int i = 0; i < cuentas.length; i++) {
			System.out.println(cuentas[i]);
		}
		
	}

}
