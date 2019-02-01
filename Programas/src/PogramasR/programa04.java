package PogramasR;

import java.util.Scanner;

public class programa04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingrese su edad");
		int edad=leer.nextInt();
		
		if (edad>=18) 
			System.out.println("Es mayor de edad");
			else System.out.println("Es menor de edad");
		}
	}


