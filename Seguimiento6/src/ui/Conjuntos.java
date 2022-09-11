package ui;

public class Conjuntos<I,E> {
	
	private I identificador;
	private E elemento;
	
	public Conjuntos(I identificador, E elemento) {
		this.identificador = identificador;
		this.elemento = elemento;
	}
	
	
	//Se adapta al valor que se le da en el Main
	
	public I getIdentificador(){
		return identificador;
	}
	
	public void setIdentificador(I nuevoValorI) {
		identificador = nuevoValorI;
	}
	
	
	public E getElemento() {
		return elemento;
	}
	
	public void setElemento(E nuevoValorE) {
		elemento = nuevoValorE;
	}
	
	
	
	
	
	

}
