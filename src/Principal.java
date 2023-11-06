import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variables
		int numCliente;
		String nombre;
		String apellidos;
		float saldo;

		int menuP, subMenu;
		float suma = 0;

		// Variables tipo objeto
		Scanner lectura = null;
		Clientes cliente = null;

		// Instancia de clases
		Implementacion imp = new Implementacion();

		Clientes c1 = new Clientes(12345, "Jesus", "Hernandez", 24512);
		Clientes c2 = new Clientes(23456, "Alberto", "Perez", 45267);

		imp.guardar(c1);
		imp.guardar(c2);

		do {
			System.out.println("MENU BANCOMER BIENVENIDO");
			System.out.println("1---ALTA CLIENTE");
			System.out.println("2---CONSULTAR SALDO");
			System.out.println("3---DEPOSITO EN EFECTIVO");
			System.out.println("4---RETIRO EN EFECTIVO");
			System.out.println("5---SALIR");

			lectura = new Scanner(System.in);
			menuP = lectura.nextInt();

			switch (menuP) {
			case 1:
				System.out.println("Ingrese el numero de cliente");
				lectura = new Scanner(System.in);
				numCliente = lectura.nextInt();

				System.out.println("Ingrese el nombre del cliente");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();

				System.out.println("Ingrese los apellido del cliente");
				lectura = new Scanner(System.in);
				apellidos = lectura.nextLine();

				System.out.println("Ingrese el saldo del cliente");
				lectura = new Scanner(System.in);
				saldo = lectura.nextFloat();

				cliente = new Clientes(numCliente, nombre, apellidos, saldo);
				imp.guardar(cliente);
				System.out.println("Se guardo correctamente el registro: " + cliente.getNombre() + "\n");

				break;
			case 2:
				System.out.println("Ingrese su numero de cliente");
				lectura = new Scanner(System.in);
				numCliente = lectura.nextInt();

				// busqueda de cliente
				cliente = new Clientes(numCliente);
				cliente = imp.buscar(cliente);
				System.out.println("Buen dia " + cliente.getNombre() + " su saldo es de " + cliente.getSaldo() + "\n");
				break;
			case 3:
				System.out.println("Ingrese su numero de cliente");
				lectura = new Scanner(System.in);
				numCliente = lectura.nextInt();

				// busqueda de cliente
				cliente = new Clientes(numCliente);
				cliente = imp.buscar(cliente);

				// Se edita el saldo

				while (true) {
					System.out.println("Ingrese un billete");
					System.out.println("Si ya no desea seguir ingresando, ingrese [0]");
					lectura = new Scanner(System.in);
					float valor = lectura.nextFloat();

					if (valor == 0) {
						break;
					}

					if (imp.validarBillete(valor) == true) {

						suma += valor;
					} else {
						System.out.println("billete invalido");
					}

				}
				imp.depositoEfectivo(cliente, suma);
				System.out.println("Su saldo actual es " + cliente.getSaldo() + "\n");

				break;
			case 4:
				System.out.println("Ingrese su numero de cliente");
				lectura = new Scanner(System.in);
				numCliente = lectura.nextInt();

				// busqueda de cliente
				cliente = new Clientes(numCliente);
				cliente = imp.buscar(cliente);

				// Se edita el saldo
				System.out.println("Ingrese la cantidad de efectivo a retirar");
				lectura = new Scanner(System.in);
				saldo = lectura.nextFloat();
				System.out.println("Ingrese tipo de billete que quiere recibir");
				System.out.println("--20--50--100--200--500-1000");
				lectura = new Scanner(System.in);
				float valor = lectura.nextFloat();
				if (imp.validarBillete(valor) == true) {

					suma = saldo / valor;
					imp.retiroEfectivo(cliente, saldo);
					System.out.println("Se retiraran " + suma + " billetes de " + valor);
					System.out.println("Su saldo acutual es " + cliente.getSaldo() + "\n");

				} else {
					System.out.println("billete invalido");
				}

				break;
			case 5:

				break;

			default:
				break;
			}

		} while (menuP < 5);

	}

}
