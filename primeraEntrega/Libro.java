package primeraEntrega;

public class Libro {
	private String titulo,autor;
	private int cantPaginas;
	
	public Libro(String t,String a,int cant){
		this.titulo=t;
		this.autor=a;
		this.cantPaginas=cant;
	
	}
	public String getTitulo() {
		
		return this.titulo;
	}
	public String getAutor() {
		
		return this.autor;
	}
	public int getCantPaginas() {
		return this.cantPaginas;
	}
	
	
}
