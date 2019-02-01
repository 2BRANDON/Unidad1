package PogramasR;

import java.util.Scanner;

public class programa07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer=new Scanner (System.in);

		System.out.println("Ingrese un valor de temperatura en grados Fahrenheit");
		double gradosF=leer.nextDouble();
		
		double gradosC=(gradosF-32)/1.8000;
		
		System.out.println("Temperatura en grados Fahrenheit: "+ gradosF);
		System.out.println("Temperatura en grados Centigrados: "+ gradosC);


	}

}
