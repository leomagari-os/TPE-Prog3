package segundaEntrega;	

public class Nodo {
	private Libro info;
	private Nodo siguiente;
	public Nodo(Libro l){
		this.info=l;
		this.siguiente=null;
	}
	public Nodo getSiguiente() {
		// TODO Auto-generated method stub
		return this.siguiente;
	}
	public void setSiguiente(Nodo n) {
		this.siguiente=n;
	}
	public Libro getInfo() {
		return this.info;
	}
	
}
