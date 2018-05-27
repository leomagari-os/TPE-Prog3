package primeraEntrega;

public class Genero {
	private String titulo;
	private Lista libros;
	public Genero(String t){
		this.titulo=t;
		this.libros=new Lista();
	}
	public void insertarLibro(Libro l) {
		this.libros.insertar(l);
	}
	public String getTitulo() {
		return this.titulo;
	}
	public Lista getLibros() {
		return this.libros;
	}
}
