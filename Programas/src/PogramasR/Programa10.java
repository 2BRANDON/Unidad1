package PogramasR;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer=new Scanner (System.in);
		DecimalFormat formateador=new DecimalFormat("####,###.##");
		double acum=0;
		double cont=0;
		System.out.println ("Ingrese la cantidad del producto");
		double Prod1= leer.nextDouble();
		cont=cont+1;
		System.out.println ("Ingrese la cantidad del producto");
		double Prod2= leer.nextDouble();
		cont=cont+1;
		System.out.println ("Ingrese la cantidad del producto");
		double Prod3= leer.nextDouble();
		cont=cont+1;
		
		
		acum=Prod1+Prod2+Prod3;
		
		if (acum>=1500) {
				
			double total_inc=acum*.11+acum;
			System.out.println ("Su incremento es de 11%");
			System.out.println ("El numero de productos es:"+""+ formateador.format(cont));
			System.out.println ("El monto sin incremento es:"+""+formateador.format(acum));
			System.out.println ("El monto total con incremento es:"+""+formateador.format(total_inc));
		}

		else {
		
			double total_inc=acum*.10+acum;
			System.out.println ("Su incremento es de 10%");
			System.out.println ("El numero de productos es:"+""+ formateador.format(cont));
			System.out.println ("El monto sin incremento es:"+""+formateador.format(acum));
			System.out.println ("El monto total con incremento es:"+""+formateador.format(total_inc));
		}

		
		}
				
	}


