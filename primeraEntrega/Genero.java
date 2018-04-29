package primeraEntrega;

public class Genero {
	private String titulo;
	private Lista libros;
	public Genero(String t){
		this.titulo=t;
		this.libros=null;
	}
	public void insertarLibro(Libro l) {
		this.libros.insertar(l);
	}
	public String getTitulo() {
		return this.titulo;
	}
}
