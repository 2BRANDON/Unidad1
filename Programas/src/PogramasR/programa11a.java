package PogramasR;

import java.text.DecimalFormat;
import java.util.Scanner;

public class programa11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer=new Scanner(System.in);
		DecimalFormat formateador=new DecimalFormat("####,###.##");
		double nomina=0, isr=0, acum=0.0, sueldo=0.0, max=8500.0, min=1500.0;
		int contador=0, numEmpleados=0;
		
		
		System.out.println("Ingrese el numero de empleados a registrar");
		 numEmpleados=leer.nextInt();
		 contador=1;
		 
		 do {
		
		System.out.println("Ingrese en sueldo del empleado "+ contador);
		sueldo=leer.nextDouble();
		
		acum+=sueldo;
		if(sueldo>min) {
			min=sueldo;
		}
		if(sueldo<max) {
			max=sueldo;
		}
		contador++;
		 }while (contador<=numEmpleados);
		 
		 
		 
		 isr= acum*.33; 
	   	nomina=acum-isr;
	   	System.out.println("El total de la nomina sin isr es:"+formateador.format(acum));
	   	System.out.println("El ISR ES: "+formateador.format(isr));
	   	System.out.println("Salario maximo: "+formateador.format(min));
	   	System.out.println("Salario minimo: "+formateador.format(max));
		
			
			
			
		
		
		
	}

}
