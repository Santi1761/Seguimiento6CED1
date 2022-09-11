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
		System.out.println("Cuantos elementos quieres que tenga el conjunto?");
		int elem = sc.nextInt();
		sc.nextLine();
		
		Set<T> setA = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto");
		
		
		for(int i=0;i<elem;i++) {
			controlador[i]  = (T) sc.nextLine ();			
		}
				
	}
	
	public void unionConjuntos(){
		
		System.out.println("Cuantos elementos quieres que tenga el conjunto?");
		int elem = sc.nextInt();
		sc.nextLine();
		
		Set<T> setA = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto");
		
		for(int i=0;i<elem;i++) {
			controlador[i] = (T)sc.nextLine();			
		}
				
		setA.addAll(Arrays.asList(controlador));
				
		
		System.out.println("Cuantos elementos quieres que tenga el conjunto 2?");
		int elem2 = sc.nextInt();
		sc.nextLine();
		
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
		
		System.out.println("Cuantos elementos quieres que tenga el conjunto?");
		int elem = sc.nextInt();
		sc.nextLine();
		
		Set<T> setA = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto");
		
		for(int i=0;i<elem;i++) {
			controlador[i] = (T)sc.nextLine();			
		}
				
		setA.addAll(Arrays.asList(controlador));
				
		
		System.out.println("Cuantos elementos quieres que tenga el conjunto 2?");
		int elem2 = sc.nextInt();
		sc.nextLine();
		
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
		
		System.out.println("Cuantos elementos quieres que tenga el conjunto?");
		int elem = sc.nextInt();
		sc.nextLine();
		
		Set<T> setA = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto");
		
		for(int i=0;i<elem;i++) {
			controlador[i] = (T)sc.nextLine();			
		}
				
		setA.addAll(Arrays.asList(controlador));
				
		
		System.out.println("Cuantos elementos quieres que tenga el conjunto 2?");
		int elem2 = sc.nextInt();
		sc.nextLine();
		
		Set<T> setB = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto 2");
		
		for(int i=0;i<elem;i++) {
			controlador[i] = (T)sc.nextLine();	
					
		}
		
		setB.addAll(Arrays.asList(controlador));
		
		Set<T> inter = new HashSet<>(setA);
		
		if(!inter.contains(setB){
			inter.remove(inter.contains(setB));
		}

		
		System.out.println("///////////////////////////////////");
		System.out.print("La diferencia del conjunto 1 y 2 es: ");
		System.out.println(inter);
	}
	
	public void diferenciaSimetricaConjuntos() {
		
		System.out.println("Cuantos elementos quieres que tenga el conjunto?");
		int elem = sc.nextInt();
		sc.nextLine();
		
		Set<T> setA = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto");
		
		for(int i=0;i<elem;i++) {
			controlador[i] = (T)sc.nextLine();			
		}
				
		setA.addAll(Arrays.asList(controlador));
				
		
		System.out.println("Cuantos elementos quieres que tenga el conjunto 2?");
		int elem2 = sc.nextInt();
		sc.nextLine();
		
		Set<T> setB = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto 2");
		
		for(int i=0;i<elem;i++) {
			controlador[i] = (T)sc.nextLine();	
					
		}
		
		setB.addAll(Arrays.asList(controlador));
		
		Set<T> inter = new HashSet<>(setA);
		
		inter.remove(inter.retainAll(setB));

		Set<T> setDiferencia = new HashSet<T>();

		setDiferencia.addAll(inter);
		
		System.out.println("///////////////////////////////////");
		System.out.print("La diferencia Simetrica del conjunto 1 y 2 es: ");
		System.out.println(setDiferencia);
	}
	
	public void complementoConjuntos() {
		
		System.out.println("Cuantos elementos quieres que tenga el conjunto?");
		int elem = sc.nextInt();
		sc.nextLine();
		
		Set<T> setA = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto");
		
		for(int i=0;i<elem;i++) {
			controlador[i] = (T)sc.nextLine();			
		}
				
		setA.addAll(Arrays.asList(controlador));
				
		
		System.out.println("Cuantos elementos quieres que tenga el conjunto 2?");
		int elem2 = sc.nextInt();
		sc.nextLine();
		
		Set<T> setB = new HashSet<T>();
		
		System.out.println("Escribe los elementos del conjunto 2");
		
		for(int i=0;i<elem;i++) {
			controlador[i] = (T)sc.nextLine();	
					
		}
		
		setB.addAll(Arrays.asList(controlador));
		
		Set<T> inter = new HashSet<>(setA);
		
		if(inter.contains(setB){
			inter.remove(!inter.contains(setB));
		}
		
		System.out.println("///////////////////////////////////");
		System.out.print("El complemento del conjunto 1 y 2 es: ");
		System.out.println(inter);
	}
	
}
