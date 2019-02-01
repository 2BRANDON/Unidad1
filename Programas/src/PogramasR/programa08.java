package PogramasR;

import java.util.Scanner;

public class programa08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer=new Scanner (System.in);
		
		System.out.println("Ingrese un numero de la semana 1-7 para mostrar el dia correspondiente");
		byte num=leer.nextByte();
		
		switch(num) {
		case 0:System.out.println("");
		break;
		
		case 1:System.out.println("Lunes");
		break;
		
		case 2: System.out.println("Martes");
		break;
		
		case 3: System.out.println("Miercoles");
		break;
		
		case 4: System.out.println("Jueves");
		break;
		
		case 5: System.out.println("Viernes");
		break;
		
		case 6: System.out.println("Sabado");
		break;
		
		case 7: System.out.println("Domingo");
		break;
		}
		

	}

}
