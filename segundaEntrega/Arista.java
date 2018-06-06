package segundaEntrega;

public class Arista {
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
	public int compareTo(Arista a){
		Integer pesoLocal= new Integer(this.peso);
		Integer pesoA= new Integer(a.getPeso());
		return pesoLocal.compareTo(pesoA);
	}

}
