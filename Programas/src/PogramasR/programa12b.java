package PogramasR;

import java.util.Scanner;

public class programa12b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner (System.in);
		int promedio=0, cont=1, min, cont1=0, cont2=0, totalmin=0, numClientes;

		
		System.out.println ("¿Cuántos clientes desea registrar?");
		numClientes = leer.nextInt();
		
		while (cont<=numClientes){
		System.out.println("¿Cuánto minutos al mes consume el cliente "+ cont + "?");
		min=leer.nextInt();
		
		totalmin+=min;
		promedio=totalmin/cont;
		cont++;
		
		if(min<100){
			cont1++;
		}
		if (min>100){
			cont2++;
		}
		}
		System.out.println("Total de minutos " + totalmin);
		System.out.println("Promedio de consumo por minutos al mes: " + promedio);
		System.out.println("Total  de personas que consumieron más de 100 minutos al mes: " + cont2);
		System.out.println("Total  de personas que consumieron menos de 100 minutos al mes: " + cont1);
	}
	}
