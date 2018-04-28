package primeraEntrega;

public class Libro {
	private String titulo,autor;
	private int cantPaginas;
	private Genero[] generos;
	public Libro(String t,String a,int cant){
		this.titulo=t;
		this.autor=a;
		this.cantPaginas=cant;
		this.generos=null;
	}
	
}
