package primeraEntrega;

public class Genero {
	private static int comparados;
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
	public static void comparado(){
		comparados++;
	}
	public static int getComparados(){
		return comparados;
	}
}
