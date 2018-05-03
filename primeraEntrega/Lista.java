package primeraEntrega;

public class Lista {
	private Nodo head;
	private Nodo last;
	public Lista(){
		this.head=null;
		this.last=null;
	}
	public void insertar(Libro l) {
		if(this.head==null) {
			this.head=new Nodo(new Libro(l.getTitulo(),l.getAutor(),l.getCantPaginas(),l.getGeneros()));
			this.last=this.head;
		}else {
			insertar(this.last,l);
		}
	}
	private void insertar(Nodo n, Libro l) {
		if(n.getSiguiente()!=null) {
			insertar(n.getSiguiente(),l);
		}else {
			n.setSiguiente(new Nodo(l));
			this.last=n.getSiguiente();
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
