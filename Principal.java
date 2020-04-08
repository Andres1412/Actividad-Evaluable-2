/**
 * Autor: Andrés Rocher Escriva
 * Ejercicio 4 Tema 7 - Herencia
 */

package Tema7ejer5;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto P1 = new Producto();
		
		Producto P2 = new Producto();
		
		Perecedero P3 = new Perecedero();
		
		Perecedero P4 = new Perecedero();
		
		NoPerecedero P5 = new NoPerecedero();
		
		Producto[] Productos = new Producto[5];
		
		Productos[0] = P1;
		Productos[1] = P2;
		Productos[2] = P3;
		Productos[3] = P4;
		Productos[4] = P5;
		
		
	}

}
