package PogramasR;

import java.util.Scanner;

public class Programa09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner (System.in);
		System.out.println("Seleccione una opcion de 1-3");
		System.out.println ("1.- Convertir pulgadas a centimetros");
		System.out.println ("2.- Convertir pies a centimetros");
		System.out.println ("3.- Convertir pies pulgadas");

		int i =leer.nextInt();
		switch (i ) {
		case 1: System.out.println("Ingrese pulgadas a convertir");
		double pulg=leer.nextInt();
		double cent=pulg*2.54;
		System.out.print(cent+" Centimetros"); 
		break;
		
		case 2: System.out.println("Ingrese Pies a convertir");
		double pies=leer.nextInt();
		double cent1=pies*30.48;
		System.out.print(cent1+" Centimetros");
		break;
		
		case 3: System.out.println("Ingrese pies a convertir");
		double pies1=leer.nextInt();
		double pulg1=pies1*12;
		System.out.println(pulg1+" Pulgadas");
		break;
		default: System.out.println("Valor no valido, ingrese otro valor");
		}
		
	}

}
