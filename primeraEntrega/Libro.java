package primeraEntrega;

public class Libro {
	private String titulo,autor;
	private int cantPaginas;
	private String generos;
	public Libro(String t,String a,int cant,String generos){
		this.titulo=t;
		this.autor=a;
		this.cantPaginas=cant;
		this.generos=generos;
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
	public String getGeneros() {
		
		return this.generos;
	}
	
}
