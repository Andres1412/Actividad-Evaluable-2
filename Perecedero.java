/**
 * Autor: Andrés Rocher Escriva
 * Ejercicio 4 Tema 7 - Herencia
 */

package Tema7ejer5;

public class Perecedero extends Producto {
	
	int diasACaducar;//variable

	public Perecedero() {//Contructor predeterminado
		
	}
	
	public Perecedero(int diasACaducar, String nombre, double precio) {//Contructor parametrizado con tres parametros
		
		super(nombre, precio);
		this.diasACaducar=diasACaducar;
		
	}
	//------------------------------------------------------------------------------------------------
	//Getters / Setters
	
	public int getDiasACaducar() {
		
		return diasACaducar;
		
	}
	
	public void setDiasACaducar(int diasACaducar) {
		
		this.diasACaducar=diasACaducar;
		
	}
	//-------------------------------------------------------------------------------------------------
	
	public double calcular(int cantidad) {//metodo 
		
		double fin=super.calcular(cantidad);
		
		switch (diasACaducar) {
		
		case 1:
			
			fin=fin/4;
		break;
		
		case 2:
		
			fin=fin/3;
		break;	
		
		case 3:
			
			fin=fin/3;
		break;	
		}
		return fin;
	}
	
	
}
