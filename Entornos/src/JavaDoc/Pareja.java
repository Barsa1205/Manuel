package JavaDoc;

public class Pareja {
	//atr
	/*
	 * @serial p1 es un atributo de esta clase qué ha sido creado en el
	 * método principal
	 * @serial p2 es un atributo de esta clase qué ha sido creado en el
	 * método principal
	 * @serial regaloParaPersona1 es un atributo de esta clase qué ha sido creado en el
	 * método principal
	 * @serial regaloParaPersona2 es un atributo de esta clase qué ha sido creado en el
	 * método principal
	 */
	private Persona persona1, persona2;
	private Regalo regaloParaPersona1, regaloParaPersona2;
	
	//metodos constructores
	public Pareja(Persona p1, Persona p2) {
		persona1=p1;
		persona2=p2;
		regaloParaPersona1=new Regalo("","",0);
		regaloParaPersona2=new Regalo("","",0);
	}
	
	//setters
	public void setRegaloParaPersona1(Regalo regalo){
		regaloParaPersona1=regalo;
	}
	public void setRegaloParaPersona2(Regalo regalo){
		regaloParaPersona2=regalo;
	}
	
	//getters
	/*
	 * @return Método que devuelve el cálculo del gasto de ambos regalos
	 */
	public double calcularCostoTotal(){
		return regaloParaPersona1.getPrecio()+regaloParaPersona2.getPrecio();
	}
	public void mostrarDetalles() {
		System.out.println("Regalo para la persona 1");
		System.out.println(regaloParaPersona1.toString()); 
		System.out.println();
		System.out.println("Regalo para la persona 2");
		System.out.println(regaloParaPersona2.toString());
		System.out.println();
		System.out.println("Precio total: "+calcularCostoTotal()+"$");
	}
	
	/*
	 * @return Método que devuelve la información completa de la clase
	 * nombre de las personas y el regalo de cada una
	 */
	public String toString() {
		return persona1.toString()+"\n"+regaloParaPersona2.toString()+"\n"
	           +persona2.toString()+"\n"+regaloParaPersona1.toString()+
	           "\nPrecio total: "+calcularCostoTotal()+"$";
	}
}
