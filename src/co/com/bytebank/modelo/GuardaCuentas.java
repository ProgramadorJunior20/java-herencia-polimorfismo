package co.com.bytebank.modelo;

public class GuardaCuentas {
	
	// Crear un objeto para guardar muchas cuentas
	// Que tambien pueda permitirnos agregar cuentas con un metodo{
	// Ejemplo de metodo GuardaCuentas.adiciona(cuenta);
	// Remover, Obtener, ETC
	
	Cuenta[] cuenta = new Cuenta[10];
	int indece = 0;

	public void adicionar(Cuenta adicionaCuenta) {
		cuenta[indece] = adicionaCuenta;
		indece++;
	}
	
	public Cuenta obtener(int indice) {
		return cuenta[indice];
	}
}
