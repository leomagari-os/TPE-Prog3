package segundaEntrega;

import java.util.ArrayList;

public class Grafo {
	private ArrayList<Vertice> vertices;
	public Grafo(){
		this.vertices=new ArrayList<Vertice>();
	}
	public void addVertice(Vertice v){
		Vertice o=getVertice(v.getEtiqueta());
		if(o!=null){
			o.addAdyacente(v, 1);
		}else{
			this.vertices.add(v);
		}


	}
	
	public Vertice getVertice(String v){
		for (int i = 0; i < this.vertices.size(); i++) {
			if(this.vertices.get(i).getEtiqueta().equals(v)){
				return this.vertices.get(i);
			}
		}
		return null;
	}
	public String toString(){
		String res="Grafo :\n";
		res+=imprimirVertices();
		return res;
	}
	public String imprimirVertices(){
		String res="";
		for (int i = 0; i < this.vertices.size(); i++) {
			res+=this.vertices.get(i).toString();
		}
		return res;
	}
	public void addArista(String origen, String destino) {
		// TODO Auto-generated method stub
		Vertice o=getVertice(origen);
		Vertice d=new Vertice(destino);
		o.addAdyacente(d, 1);
	}
}
