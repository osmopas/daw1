public class Persona {
	String telefono

	public Persona(String telefono) {
		super();
		this.telefono = telefono;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}

public class Profesor extends Persona {
	String nombre, telefono;
	int edad;
	List<Prestamos> prestamos;

	public Profesor(String telefono) {
		super(telefono);
	}
	public String getInfo() {
		return "Nombre: "+nombre+"\nEdad: "+edad+"\nTeléfono: "+telefono;
	}
	public void printInfo() {
		System.out.println(getInformacion());
	}
	public void printAllInfo() {
		printInfo();
		for (Prestamo p: prestamos) {
			System.out.println(p);
		}
	}


}