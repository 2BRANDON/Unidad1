package PogramasR;

import java.util.Scanner;

public class programa12a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		int cont=1, cont1=0, cont2=0, ventas;
		double venta;
		
		System.out.println("¿Cuántas ventas registrará?");
		ventas=leer.nextInt();
		
		
		while (cont<=ventas){
		System.out.println("Registre venta " + cont);
		venta = leer.nextInt(); 
		cont++; 
		if (venta>=0 && venta<=200){
			cont1++;
		}
		if (venta>200 && venta<400){
			cont2++;
		}
		}
		System.out.println("El total de ventas mayor a 0 y menor o igual a 200, es de: " + cont1);
		System.out.println("El total de ventas mayor a 200 y menor a 400, es de: " + cont2);
		}
		}