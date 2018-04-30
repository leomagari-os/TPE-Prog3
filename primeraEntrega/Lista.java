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
			insertar(this.head,l);
		}
	}
	private void insertar(Nodo n, Libro l) {
		if(n.getSiguiente()!=null) {
			insertar(n.getSiguiente(),l);
		}else {
			n.setSiguiente(new Nodo(l));
		}
	}
	public Nodo getHead() {
		return this.head;
	}
	public void imprimir() {
		imprimir(this.head);
	}
	private void imprimir(Nodo n) {
		if(n!=null) {
			System.out.println(n.getInfo().getTitulo());
			imprimir(n.getSiguiente());	
		}
		
	}
	
}
