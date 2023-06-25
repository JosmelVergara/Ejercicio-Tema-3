
public class Persona {
	public static void main(String[] args) {
		People persona = new People();
		persona.setEdad(22);
		persona.setNombre("Josmel");
		persona.setTelefono(987654321);
		
		System.out.println(persona.getEdad());
		System.out.println(persona.getNombre());
		System.out.println(persona.getTelefono());
		
	}
	


}

class People{
	private int edad;
	private String nombre;
	private int telefono;
	

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
}

