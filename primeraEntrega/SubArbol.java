package primeraEntrega;

public class SubArbol {
	private SubArbol izq;
	private SubArbol der;
	private Genero info;
	public SubArbol(Genero i) {
		this.info= i;
		this.izq=null;
		this.der=null;
	}
	public SubArbol getIzq() {
		return izq;
	}
	public void setIzq(SubArbol izq) {
		this.izq = izq;
	}
	public SubArbol getDer() {
		return der;
	}
	public void setDer(SubArbol der) {
		this.der = der;
	}
	public Genero getInfo() {
		return info;
	}
	public void setInfo(Genero info) {
		this.info = info;
	}
	
	public void imprimir() {
		if(this.izq!=null) {
			this.izq.imprimir();
		}
		System.out.println(this.info.getTitulo());
		if(this.der!=null) {
			this.der.imprimir();
		}
	}
	
	
}
