package co.com.bytebank.modelo;

public class GuardaReferencias {

	// Crear un objeto para guardar muchas cuentas
	// Que tambien pueda permitirnos agregar cuentas con un metodo{
	// Ejemplo de metodo GuardaCuentas.adiciona(cuenta);
	// Remover, Obtener, ETC

	Object[] referencias = new Object[10];
	int indece = 0;

	public void adicionar(Object adicionaCuenta) {
		referencias[indece] = adicionaCuenta;
		indece++;
	}

	public Object obtener(int indice) {
		return referencias[indice];
	}

}
