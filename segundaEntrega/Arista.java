package segundaEntrega;

public final class Arista {
	private Vertice origen;
	private Vertice destino;
	private int peso;
	public Arista(Vertice o,Vertice d,int p){
		this.origen=o;
		this.destino=d;
		this.peso=p;
	}
	public Vertice getOrigen() {
		return origen;
	}
	public Vertice getDestino() {
		return destino;
	}
	public int getPeso() {
		return peso;
	}
	public void contarArista(){
		this.peso++;
	}

}
