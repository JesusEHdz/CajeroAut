
public class Clientes {
	
	//Atributos
	private int numCliente;
	private String nombre;
	private String apellidos;
	private float saldo;
	
	//Constructores
	public Clientes() {
	}

	public Clientes(int numCliente) {
		this.numCliente = numCliente;
	}

	public Clientes(int numCliente, String nombre, String apellidos, float saldo) {
		this.numCliente = numCliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.saldo = saldo;
	}
	
	
    //encapsulamiento
	public int getNumCliente() {
		return numCliente;
	}

	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	

}
