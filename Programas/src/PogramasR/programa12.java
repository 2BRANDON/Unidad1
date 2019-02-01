package PogramasR;

import java.util.Scanner;

public class programa12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer=new Scanner(System.in);
		
		byte nCalificaciones, i=0;
		double promedio=0.0, acum=0,  calificacion=0.0;
		
		
		System.out.println("Ingrese un numero de calificaciones a reistrar");
		nCalificaciones=leer.nextByte();
		
		
		
		while(i<nCalificaciones) {
			
			System.out.println("Ingrese la calificacion"+(i+1)+":");
			calificacion=leer.nextDouble();
			
			acum+=calificacion;
			i++;
		
			promedio=calificacion/i;
		}
			
			if(promedio>=0 && promedio<=49) {
				System.out.println("Suspendido");	
			}
			if(promedio>=50 && promedio<=69) {
				System.out.println("Aprobado");	
			}
			if(promedio>=70 && promedio<=89) {
				System.out.println("Notable");	
			}
			if(promedio>=90 && promedio<=99) {
				System.out.println("Sobresaliente");	
			}
			if(promedio==100) {
				System.out.println("Matricula de honor");	
			}
			
		
	
	}

}
