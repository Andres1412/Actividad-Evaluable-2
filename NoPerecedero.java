/**
 * Autor: Andrés Rocher Escriva
 * Ejercicio 4 Tema 7 - Herencia
 */

package Tema7ejer5;

public class NoPerecedero extends Producto {
	
	int tipo;
	
	public NoPerecedero() {//contructor x defecto
		
	}

	public NoPerecedero(int tipo, String nombre, double precio) {//contructor con 3 parámetros
		
		super(nombre, precio);
		this.tipo=tipo;
		
	}
	//-----------------------------------------------------------------------------------------------
	//Getters / Setters
	
	public int getTipo() {
		
		return tipo;
		
	}
	
	public void setTipo(int tipo) {
		
		this.tipo=tipo;
		
	}
	//-----------------------------------------------------------------------------------------------
	
	public double calcular(int cantidad) {//metodo para calcular el precio en producto
		
		double fin=super.calcular(cantidad);
		
		return fin;
		
	}
}
