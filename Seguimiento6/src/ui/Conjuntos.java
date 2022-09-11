package ui;

public class Conjuntos<T> {
	
	public Conjuntos() {
		primero = null;
	}
	public void setPrimero(T nuevoValor) {
		primero = nuevoValor;
	}
	//Se adapta al valor que se le da en el Main
	public T getPrimero(){
		return primero;
	}
	private T primero;

}
