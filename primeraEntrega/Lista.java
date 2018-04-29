package primeraEntrega;

public class Lista {
	private Nodo head;
	public Lista(){
		this.head=null;
	}
	public void insertar(Libro l) {
		if(this.head==null) {
			this.head=new Nodo(new Libro(l.getTitulo(),l.getAutor(),l.getCantPaginas(),l.getGeneros()));
		}else {
			insertar(this.head.getSiguiente(),l);
		}
	}
	private void insertar(Nodo n, Libro l) {
		if(n.getSiguiente()!=null) {
			insertar(n.getSiguiente(),l);
		}else {
			n.setSiguiente(new Nodo(l));
		}
	}
	
}
