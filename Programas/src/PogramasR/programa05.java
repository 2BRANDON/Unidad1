package PogramasR;

import java.util.Scanner;

public class programa05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingrese la calificación de su examen 0-100");
		double calificacion=leer.nextDouble();
		
		if (calificacion>=80)
			System.out.println("Aprobado");
		else 		
			System.out.println("Reprobado");


	}

}
