package primeraEntrega;



public class ColeccionLibros {
	Lista libros=null;
	public ColeccionLibros() {
		
	}
	public void setLibros(Lista l) {
		this.libros=l;
	}
	public Lista getLibrosPorGenero(String genero){
		Lista res=null;
		Nodo n=this.libros.getHead();
		
		while(n!=null){
			Libro l= n.getInfo();
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
			n=n.getSiguiente();
		}
		return res;
	}
}
