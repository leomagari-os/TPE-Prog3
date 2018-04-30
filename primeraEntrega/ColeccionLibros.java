package primeraEntrega;

import java.util.ArrayList;

public class ColeccionLibros {
	ArrayList<Libro>libros=null;
	public ColeccionLibros() {
		
	}
	public void setLibros(ArrayList<Libro>l) {
		this.libros=l;
	}
	public Lista getLibrosPorGenero(String genero){
		Lista res=null;
		for(int i=0;i<this.libros.size();i++) {
			Libro l= libros.get(i);
			String[] generos=l.getGeneros().split(" ");
			for(int j=0;j<generos.length;j++) {
				if(generos[j].equals(genero)){
					if(res==null) {
						res=new Lista();
					}
					res.insertar(l);
					break;
				}
			}
		}
		return res;
	}
}
