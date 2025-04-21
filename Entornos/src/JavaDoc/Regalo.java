package JavaDoc;

public class Regalo {
	//atr
	/*
	 * @serial nombre Atributo que guarda el nombre del regalo
	 * @serial descripcion Atributo que guarda la descripción del regalo
	 * @serial precio Atributo que guarda el precio del regalo  
	 */
	private String nombre, descripcion;
	private double precio;
	
	//metodos constructores
	public Regalo(String nombre, String descripcion, double precio) {
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.precio=precio;
	}
	
	//getters
	/*
	 * @return Método get que devuelve el nombre del regalo
	 */
	public String getNombre() {
		return nombre;
	}
	/*
	 * @return Método get que devuelve la descripción del regalo
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/*
	 * @return Método get que devuelve el precio del regalo
	 */
	public double getPrecio() {
		return precio;
	}
	
	//setters
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion=descripcion;
	}
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	/*
	 * @return Método que devuelve la información completa del regalo
	 * su nombre, precio y descripción
	 */
	public String toString() {
		return "Nombre del regalo: "+nombre+"\nDescripcion: "+descripcion+"\nPrecio: "+precio+"$";
	}
}
