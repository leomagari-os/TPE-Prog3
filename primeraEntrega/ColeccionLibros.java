package primeraEntrega;

import java.util.ArrayList;



public class ColeccionLibros {
	ArrayList<Libro> libros=null;
	public ColeccionLibros() {
		
	}
	public void setLibros(ArrayList<Libro> l) {
		this.libros=l;
	}
	public ArrayList<Libro> getLibrosPorGenero(String genero){
		ArrayList<Libro> res=null;
		
		for(int i=0;i<this.libros.size();i++){
			Libro l=this.libros.get(i);
			String[] generos=l.getGeneros().split(" ");
			for(int j=0;j<generos.length;j++) {
				if(generos[j].equals(genero)){
					if(res==null) {
						res=new ArrayList<Libro>();
					}
					res.add(l);
					break;
				}
			}
		
		}
		return res;
	}
	
}
