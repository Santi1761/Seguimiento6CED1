package ui;

import java.util.Scanner;
import model.Conjuntos;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);	
	
	public static void main(String[] args) {
		
		String [] longitud = new String[99];
		Conjuntos longitud_conjunto = new Conjuntos(longitud);
		
		int opcion = menu();

		switch(opcion) {
		
		case 1:
			longitud_conjunto.elaborarConjuntos();
			break;
			
		case 2:
			longitud_conjunto.unionConjuntos();
			break;

		case 3:
			longitud_conjunto.interseccionConjuntos();
			break;
		
		case 4:
			longitud_conjunto.diferenciaConjuntos();
			break;
			
		case 5:
			longitud_conjunto.diferenciaSimetricaConjuntos();
			break;
			
		case 6:
			longitud_conjunto.complementoConjuntos();
			break;

		case 7:
			System.out.println("Saliste correctamente");
			System.exit(0);
			break;
		}		
	}
	
	
	public static int menu() {
		
		int menu=0;
		System.out.println("                         Menu Principal                    ");
		System.out.println("-----------------------------------------------------------");
		System.out.println("(1) Crear un conjunto.");
		System.out.println("(2) Union de 2 conjuntos");
		System.out.println("(3) Intersection de 2 conjuntos");
		System.out.println("(4) Diferencia de 2 conjuntos");
		System.out.println("(5) Diferencia simetrica de 2 conjuntos.");
		System.out.println("(6) Complemento de 2 conjuntos.");
		System.out.println("(7) Salir");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Elige una opcion");
		menu=sc.nextInt();
		sc.nextLine();

		return menu;
	}
		
	


}