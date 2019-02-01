package PogramasR;

import java.text.DecimalFormat;
import java.util.Scanner;

public class programa10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer=new Scanner (System.in);
		DecimalFormat formateador=new DecimalFormat("####,###.##");
		double acum=0;
		byte cont=1;
		
		System.out.println("Ingrese el numero de productos");
		byte noProductos=leer.nextByte();
		
		
		
		do {
		System.out.println ("Ingrese la cantidad del producto "+cont);
		double Prod= leer.nextDouble();
	
		acum=acum+Prod; //acum+=Prod
		cont++;
		
		}while (cont<=noProductos);
		
		int con=cont-1;
		
		if (acum>=1500)
		{		
			double total_inc=acum*.11+acum;
			System.out.println ("Su incremento es de 11%");
			System.out.println ("El numero de productos es:"+""+ formateador.format(con));
			System.out.println ("El monto sin incremento es:"+""+formateador.format(acum));
			System.out.println ("El monto total con incremento es:"+""+formateador.format(total_inc));
		}

		else
		{	
			double total_inc=acum*.10+acum;
			System.out.println ("Su incremento es de 10%");
			System.out.println ("El numero de productos es:"+""+ formateador.format(con));
			System.out.println ("El monto sin incremento es:"+""+formateador.format(acum));
			System.out.println ("El monto total con incremento es:"+""+formateador.format(total_inc));
		}

		
		}
				
	}
