import java.util.HashMap;

public class Implementacion implements IMetodos {

	HashMap<Integer, Clientes> hasMapClientes = new HashMap<Integer, Clientes>();

	@Override
	public void guardar(Clientes cliente) {
		// TODO Auto-generated method stub
		hasMapClientes.put(cliente.getNumCliente(), cliente);
	}

	@Override
	public Clientes buscar(Clientes cliente) {
		// TODO Auto-generated method stub
		return hasMapClientes.get(cliente.getNumCliente());
	}

	@Override
	public void editar(Clientes cliente) {
		// TODO Auto-generated method stub
		hasMapClientes.put(cliente.getNumCliente(), cliente);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hasMapClientes);
	}

	// Metodos personalizados
	public void depositoEfectivo(Clientes cliente, float saldo) {
		// TODO Auto-generated method stub

		if (saldo <= 10000) {
			float saldoFinal = cliente.getSaldo() + saldo;
			cliente.setSaldo(saldoFinal);
			System.out.println("Se ingreso correctamente la cantidad " + saldo + " a su saldo \n");
		} else {
			System.out.println("No es posible continuar con la operacion \n Limite de efectivo excedido");
		}

	}

	public void retiroEfectivo(Clientes cliente, float saldo) {
		// TODO Auto-generated method stub
		if (saldo <= 10000) {

			float saldoFinal = cliente.getSaldo() - saldo;
			cliente.setSaldo(saldoFinal);
			System.out.println("Se retiro correctamente la cantidad " + saldo + " a su saldo \n");
		} else {
			System.out.println("No es posible continuar con la operacion \n Limite de efectivo excedido");
		}

	}

	public boolean validarBillete(float valor) {
		float[] billetes = { 20, 50, 100, 200, 500, 1000 };
		boolean esValido = false;

		for (float billete : billetes) {
			if (billete==valor) {
				esValido = true;
				}
	}
		return esValido;
	}
	public void contar() {
		hasMapClientes.size();
	}

}
