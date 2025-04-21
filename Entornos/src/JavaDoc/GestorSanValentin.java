package JavaDoc;
	/*
	 * Ejercicio de Programación Orientada a Objetos Básica
	 * Se trata de un gestor para San Valentín que se encargará de:
	 * Gestionar el san Valentín, definir las carácteristicas de las
	 * Personas que conforman las Parejas y los Regalos.
	 * @author: Manuel Velásquez
	 * @version: 1.0
	 */
public class GestorSanValentin {
	/*
	 * Clase principal con el método main
	 * @serial p1 Objeto de la clase que se usarán como personas,
	 * guarda su DNI y su nombre
	 * @serial p2 Objeto de la clase que se usarán como personas,
	 * guarda su DNI y su nombre
	 * @serial r1 Objeto de la clase que se usarán como regalo,
	 * guarda nombre, descripcion y precio
	 * @serial r2 Objeto de la clase que se usarán como regalo,
	 * guarda nombre, descripcion y precio
	 */
	public static void main(String[] args) {
		Persona p1=new Persona("Pepe","12345678P");
		Persona p2=new Persona("Luna","87654321L");
		Regalo r1=new Regalo("Ramo de flores", "Es un ramo que contiede varios tipos de flores", 20);
		Regalo r2=new Regalo("Caja de chocolate", "Es una caja que contiene varios tipos de chocolate", 30);
		Pareja pareja1=new Pareja(p1, p2);
		/*
		 * @serial Uso del método de la clase Pareja 
		 */
		pareja1.setRegaloParaPersona1(r2);
		pareja1.setRegaloParaPersona2(r1);
		//otra forma
		pareja1.setRegaloParaPersona1(new Regalo("Caja de chocolate", "Es una caja que contiene varios tipos de chocolate", 30));
		pareja1.setRegaloParaPersona2(new Regalo("Ramo de flores", "Es un ramo que contiede varios tipos de flores", 20));
		pareja1.mostrarDetalles();

	}

}
