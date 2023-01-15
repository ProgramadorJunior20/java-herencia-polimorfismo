package co.com.bytebank.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import co.com.bytebank.modelo.Cuenta;
import co.com.bytebank.modelo.CuentaAhorros;
import co.com.bytebank.modelo.CuentaCorriente;

public class TestOrdenarLista2 {

	public static void main(String[] args) {

		Cuenta cc1 = new CuentaCorriente(22, 23);
		cc1.deposita(333.0);

		Cuenta cc2 = new CuentaAhorros(22, 44);
		cc2.deposita(444.0);

		Cuenta cc3 = new CuentaCorriente(22, 11);
		cc2.deposita(111.0);

		Cuenta cc4 = new CuentaAhorros(22, 22);
		cc4.deposita(222.0);

		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		System.out.println("Antes de ordenar");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}

		// Ordenar las cuentas
		// Cuelquier clase hija de de Cuenta
		// Comparator <? extend Cuenta> c
		Comparator<Cuenta> comparator = new CuentasOrdenadasPorNumero();
		lista.sort(comparator);

		System.out.println("Despues de ordenar");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
	}
}

class CuentasOrdenadasPorNumero implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		if (o1.getNumero() == o2.getNumero()) {
			return 0;
		} else if (o1.getNumero() > o2.getNumero()) {
			return 1;
		} else {
			return -1;
		}
	}
	
}