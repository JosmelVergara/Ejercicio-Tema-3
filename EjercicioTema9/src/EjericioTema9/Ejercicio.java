package EjericioTema9;


public class Ejercicio {
	
	public static void main(String[] args) {
		Cliente josmel = new Cliente(22, "Josmel", 987651, 5000);
		System.out.println(josmel.getEdad() + "\n" + josmel.getNombre() + "\n"+ josmel.getTelefono() + "\n" + josmel.getCredito());
		
	}

}


class Persona{
	private int edad;
	private String nombre;
	private int telefono;
	
	public Persona(){
		
	}

	public Persona(int edad, String nombre, int telefono) {
		this.edad = edad;
		this.nombre = nombre;
		this.telefono = telefono;
	}



	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	
	
	
}

class Cliente extends Persona{
	int credito;
	
	public Cliente(int edad, String nombre, int telefono, int credito) {
		super(edad, nombre, telefono);
		this.credito = credito;
		
	}
	
	public int getCredito() {
		return credito;
	}

}

class Trabajador extends Persona{
	double salario;
	
	
}