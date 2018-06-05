package segundaEntrega;

public class ArbolBinario {
	private SubArbol raiz; 
	public ArbolBinario() {
		this.raiz= null;
	}
	private void insertarOrdenado(Genero g, Libro l,SubArbol pos) {
		Genero.comparado();
		if(pos.getInfo().getTitulo().equals(g.getTitulo())){
			pos.getInfo().insertarLibro(l);
		}
		if(pos.getInfo().getTitulo().compareTo(g.getTitulo())>0){
			if(pos.getIzq()!=null){
				insertarOrdenado(g,l,pos.getIzq());
			}else{
				pos.setIzq(new SubArbol(g));
			}
		}else if(pos.getInfo().getTitulo().compareTo(g.getTitulo())<0){
			if(pos.getDer()!=null){
				insertarOrdenado(g,l,pos.getDer());
			}else{
				pos.setDer(new SubArbol(g));
			}
		}
		
		
		
	}
	
	
	public void imprimir() {
		this.raiz.imprimir();
	}
	public void insertarLibroEnGenero(Libro l, Genero g) {
		g.insertarLibro(l);
		
		if(this.raiz!=null) {
			insertarOrdenado(g,l,this.raiz);
		}else {
			this.raiz=new SubArbol(g);
			
		}
		
		
	}
	public Lista getLibrosDelGenero(String genero) {
		
		if(raiz!=null){
			return getLibrosDelGenero(genero, this.raiz);
		}else {
			return null;
		}
	}
	private Lista getLibrosDelGenero(String genero, SubArbol pos) {
		Lista res=null;
		
		if(pos.getInfo().getTitulo().equals(genero)){
			res= pos.getInfo().getLibros();
		}else if(pos.getInfo().getTitulo().compareTo(genero)>0){
			if(pos.getIzq()!=null){
				res=getLibrosDelGenero(genero, pos.getIzq());
			}
		}else if(pos.getInfo().getTitulo().compareTo(genero)<0){
			if(pos.getDer()!=null){
				res=getLibrosDelGenero(genero, pos.getDer());
			}
		}
		return res;
		
	}
}
