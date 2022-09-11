package model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Conjuntos<T> implements operaciones {
	
	public static Scanner sc = new Scanner(System.in);
	private T[] controlador;
	
	
	public Conjuntos(T[] conjuntos) {
		this.controlador = conjuntos;
		
	}
	
	
	@Override
	public void elaborarConjuntos() {
		System.out.println("Cuantos elementos quieres que tengan los conjuntos?");
		int elem = sc.nextInt();
		sc.nextLine();
		
		Set<T> setA = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto 1");
		
		
		for(int i=0;i<elem;i++) {
			controlador[i]  = (T) sc.nextLine ();			
		}
				
	}
	
	public void unionConjuntos(){
		
		System.out.println("Cuantos elementos quieres que tengan los conjuntos?");
		int elem = sc.nextInt();
		sc.nextLine();
		
		Set<T> setA = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto 1");
		
		for(int i=0;i<elem;i++) {
			controlador[i] = (T)sc.nextLine();			
		}
				
		setA.addAll(Arrays.asList(controlador));
				
			
		
		Set<T> setB = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto 2");
		
		for(int i=0;i<elem;i++) {
			controlador[i] = (T)sc.nextLine();	
					
		}
		
		setB.addAll(Arrays.asList(controlador));
		
		Set<T> setUnion = new HashSet<>();
		setUnion.addAll(setA);
		setUnion.addAll(setB);
		
		System.out.println("///////////////////////////////////");
		System.out.print("La union del conjunto 1 y 2 es: ");
		System.out.println(setUnion);
		
	}
	
	public void interseccionConjuntos() {
		
		System.out.println("Cuantos elementos quieres que tengan los conjuntos?");
		int elem = sc.nextInt();
		sc.nextLine();
		
		Set<T> setA = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto 1");
		
		for(int i=0;i<elem;i++) {
			controlador[i] = (T)sc.nextLine();			
		}
				
		setA.addAll(Arrays.asList(controlador));
						
				
		Set<T> setB = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto 2");
		
		for(int i=0;i<elem;i++) {
			controlador[i] = (T)sc.nextLine();	
					
		}
		
		setB.addAll(Arrays.asList(controlador));
		
		Set<T> inter = new HashSet<>(setA);
		
		inter.retainAll(setB);
		
		System.out.println("///////////////////////////////////");
		System.out.print("La interseccion del conjunto 1 y 2 es: ");
		System.out.println(inter);
	}
	
	public void diferenciaConjuntos() {
		
		System.out.println("Cuantos elementos quieres que tengan los conjuntos?");
		int elem = sc.nextInt();
		sc.nextLine();
		
		Set<T> setA = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto 1");
		
		for(int i=0;i<elem;i++) {
			controlador[i] = (T)sc.nextLine();			
		}
				
		setA.addAll(Arrays.asList(controlador));
						
		
		Set<T> setB = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto 2");
		
		for(int i=0;i<elem;i++) {
			controlador[i] = (T)sc.nextLine();	
					
		}		
		setB.addAll(Arrays.asList(controlador));
		
		
		Set<T> difer = new HashSet<>(setA);
		
		difer.removeAll(setB);

		System.out.println("La diferencia de los 2 conjuntos es: "+difer);
		
	}
	
	public void diferenciaSimetricaConjuntos() {
		
		System.out.println("Cuantos elementos quieres que tengan los conjuntos?");
		int elem = sc.nextInt();
		sc.nextLine();
		
		Set<T> setA = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto 1");
		
		for(int i=0;i<elem;i++) {
			controlador[i] = (T)sc.nextLine();			
		}
				
		setA.addAll(Arrays.asList(controlador));
				
		
		Set<T> setB = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto 2");
		
		for(int i=0;i<elem;i++) {
			controlador[i] = (T)sc.nextLine();	
					
		}
		
		setB.addAll(Arrays.asList(controlador));
		
		Set<T> diferSi = new HashSet<>(setA);
		
		diferSi.removeAll(setB);
		Set<T> diferSi2 = new HashSet<>(setB);
		
		
		diferSi2.removeAll(setA);
				
		Set <T> diferCom = new HashSet<>();
		
		diferCom.addAll(diferSi);
		diferCom.addAll(diferSi2);
		
		
		System.out.println("///////////////////////////////////");
		System.out.print("La diferencia Simetrica del conjunto 1 y 2 es: ");
		System.out.println(diferCom);
	}
	
	public void complementoConjuntos() {
		
		System.out.println("Cuantos elementos quieres que tengan los conjuntos?");
		int elem = sc.nextInt();
		sc.nextLine();
		
		Set<T> setA = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto");
		
		for(int i=0;i<elem;i++) {
			controlador[i] = (T)sc.nextLine();			
		}
				
		setA.addAll(Arrays.asList(controlador));
				
				
		Set<T> setB = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto 2");
		
		for(int i=0;i<elem;i++) {
			controlador[i] = (T)sc.nextLine();	
					
		}
		
		setB.addAll(Arrays.asList(controlador));
		
		Set<T> interComplement = new HashSet<>(setA);
		
		interComplement.retainAll(setB);
		
		Set<T> removeComplement = new HashSet<>(setB);
		
		removeComplement.removeAll(setA);
		
		Set<T> agregarComplement = new HashSet<>();
		
		agregarComplement.addAll(interComplement);
		agregarComplement.addAll(removeComplement);
		
		
		System.out.println("///////////////////////////////////");
		System.out.print("El complemento del conjunto 1 y 2 es: ");
		System.out.println(agregarComplement);
	}
	
}
