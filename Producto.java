/**
 * Autor: Andrés Rocher Escriva
 * Ejercicio 4 Tema 7 - Herencia
 */

package Tema7ejer5;

public class Producto {
	
	String nombre;//variabler
	double precio;//variable
	
	public Producto() {//Contructor predeterminado
		
		
	}
	
	public Producto(String nombre, double precio) {//Contructor con dos parámetros
		
		this.nombre=nombre;
		this.precio=precio;
		
	}
	//------------------------------------------------------------------------------------------------
	//Getters/Setters
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre=nombre;
		
	}
	
	public double getPrecio() {
		
		return precio;
		
	}
	
	public void setPrecio(double precio) {
		
		this.precio=precio;
		
	}
	//-------------------------------------------------------------------------------------------------
	
	public double calcular(int cantidad) {
		
		double fin=precio*cantidad;
		
		return fin;
		
	}
	
	
	public String toString() {//metdo para devolver los datos finales
		
		String fin="El nombre es "+nombre+" y el precio es de "+precio+" €";
		return fin;
		
	}
	
}
