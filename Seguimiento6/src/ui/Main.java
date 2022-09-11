package ui;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conjuntos <String> una = new Conjuntos<String>();
	
		una.setPrimero("Santiago");
		
		System.out.println(una.getPrimero());	
		
		
		Persona pers1 = new Persona("Ana");
		
		Conjuntos <Persona> dos = new Conjuntos <Persona>();
		//Se adapta al tipo que se maneja
		dos.setPrimero(pers1);
		System.out.print(dos.getPrimero());
	}

}

class Persona{
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	//Para que se vea el nombre
	public String toString() {
		return nombre;
	}
	
	private String nombre;
}