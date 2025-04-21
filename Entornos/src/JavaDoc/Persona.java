package JavaDoc;

public class Persona {
	//atr
	/*
	 * @serial dni guarga el DNI de la persona
	 * @serial nombre Guarga el nombre de las personas
	 */
	private String nombre, dni;
	
	//metodos constructores
	public Persona(String nombre, String dni) {
		this.dni=dni;
		this.nombre=nombre;
	}
	
	//getters
	public String getNombre() {
		return nombre;
	}
	
	/*
	 * @return Método que devuelve el DNI de la persona
	 */
	public String getDni() {
		return dni;
	}
	
	/*
	 * @return Método que devuelve la información de la persona
	 * su nombre y su DNI
	 */
	public String toString() {
		return "Nombre de la persona: "+nombre+" Dni: "+dni;
	}
}
