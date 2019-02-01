package PogramasR;

import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer=new Scanner(System.in); //Se crea una instancia de Scanner llamado leer
		System.out.print("Ingrese su nombre");
		
		String nombre=leer.nextLine(); //Se crea una variable de tipo String llamada nombre y se le da entrada a su valor por el teclado
		
		System.out.print("Hola" + nombre);
	}

}
