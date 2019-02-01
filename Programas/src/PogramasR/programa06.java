package PogramasR;

import java.util.Scanner;

public class programa06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer =new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero");
		int num=leer.nextInt();
		
		
		if (num%2 !=0)
			System.out.println("Su numero es impar");
		else
			System.out.println("Su numero es par");


		

	}

}
