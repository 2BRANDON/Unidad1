package PogramasR;

import java.util.Scanner;

public class programa10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer=new Scanner (System.in);
		int numero;
		int suma=0, cont=0;
		
		do {
			System.out.println("Ingrese un numero:");
			numero=leer.nextInt();
			
		if (numero>=0 && numero<=76) {
			 suma=suma+numero;
			cont=cont+1;
				
			}
		}while(numero<=76);
		
		System.out.println("Cantidad de numeros:"+cont);
		System.out.println("El promedio es:"+(suma/cont));

	}

}
