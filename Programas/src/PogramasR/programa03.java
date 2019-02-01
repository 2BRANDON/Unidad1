package PogramasR;

import java.util.Scanner;

public class programa03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingrese su nombre");
		String nombre=leer.nextLine();
		System.out.println("Ingrese su edad");
		int edad=leer.nextInt();
		System.out.println("Ingrese su altura");
		double altura=leer.nextDouble();
		
		System.out.println("Su nombre es: "+ nombre);
		System.out.println("Su edad es: "+ edad);
		System.out.println("Su altura es: " + altura);
	}

}
