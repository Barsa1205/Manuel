package ud6;

import java.util.Random;

//Comentario 1 09/03/2024

public class Password {
	//atr
	private String contraseña;
	private int longitud;
	
	//metodos constructores
	public Password() {
		longitud=8;
		generarContraseña();
	}
	public Password(int longitud) {
		this.longitud=longitud;
		generarContraseña();
	}
	
	//setters
	public void setLongitud(int longitud) {
		this.longitud=longitud;
	}
	
	public void generarContraseña() {
		Random random=new Random();
		String abecedario="abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		for(int i=0;i<longitud;i++) {
			contraseña+=abecedario.charAt(random.nextInt(abecedario.length()));
		}
	}
	//cambio
	//getters
	public String getContraseña() {
		return contraseña;
	}
	
	public int getLongitud() {
		return longitud;
	}
	
	public boolean esFuerte() {
		String contraseñaMayuscula=contraseña.toUpperCase();
		String contraseñaMinuscula=contraseña.toLowerCase();
		int numLetrasMayusculas=0;
		int numLetrasMinusculas=0;
		
		for(int i=0;i<contraseña.length();i++) {
			if(contraseñaMayuscula.charAt(i)==contraseña.charAt(i)) {
				numLetrasMayusculas++;
			}
		}
		
		for(int i=0;i<contraseña.length();i++) {
			if(contraseñaMinuscula.charAt(i)==contraseña.charAt(i)) {
				numLetrasMinusculas++;
			}
		}
		
		if(numLetrasMayusculas>2 && numLetrasMinusculas>1 && contraseña.length()>5) {
			return true;
		}
		
		return false;
	}
}
