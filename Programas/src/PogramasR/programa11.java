package PogramasR;

import java.util.Scanner;

public class programa11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		do {

		Scanner leer=new Scanner (System.in);
		System.out.println("Seleccione una opcion de 1-4");
		System.out.println ("1.- Convertir pulgadas a centimetros");
		System.out.println ("2.- Convertir pies a centimetros");
		System.out.println ("3.- Convertir pies pulgadas");
		System.out.println ("4.- Terminar programa");

		 i =leer.nextInt();
		switch (i ) {
		case 1: System.out.println("Ingrese pulgadas a convertir");
		double pulg=leer.nextInt();
		double cent=pulg*2.54;
		System.out.println(cent+" Centimetros"); 
		break;
		
		case 2: System.out.println("Ingrese Pies a convertir");
		double pies=leer.nextInt();
		double cent1=pies*30.48;
		System.out.println(cent1+" Centimetros");
		break;
		
		case 3: System.out.println("Ingrese pies a convertir");
		double pies1=leer.nextInt();
		double pulg1=pies1*12;
		System.out.println(pulg1+" Pulgadas");
		break;
		case 4:System.out.println ("");
		break;

		default: System.out.println("Ingrese otro valor");
		}
		}while(i!=4);
		System.out.println ("Programa terminado");

	}

}
