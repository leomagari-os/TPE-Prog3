package segundaEntrega;

import java.util.ArrayList;
import java.util.Hashtable;

import otro.Adyacente;
import otro.EstadoVisita;
import otro.Nodo;



public class Grafo {
	private Hashtable<String, EstadoVisita> tablaVisita;
	private ArrayList<Vertice> vertices;
	public Grafo(){
		this.vertices=new ArrayList<Vertice>();
	}
	public void addVertice(Vertice v){
		Vertice o=getVertice(v.getEtiqueta());
		if(o!=null){
		
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
	public int getCantVertices(){
		return this.vertices.size();
	}
	public ArrayList<Arista> getGenerosMasBuscados(Vertice v,int n){
		ArrayList<Arista>res=null;
		Vertice o=getVertice(v.getEtiqueta());
		if(o!=null){
			res=o.getGenerosMasBuscados(n);
		}
		return res;
	}
	public ArrayList<Arista> getAllGenerosAfter(Vertice v) {
		Vertice o=getVertice(v.getEtiqueta());
		if(o!=null){
			return o.getAdyacentes();
		}
		return null;
		
	}
	
	private boolean dfs_visit(Nodo v, Hashtable<String, EstadoVisita> tablaVisita) {
		
		tablaVisita.put(v.getValor(), EstadoVisita.EXPLORANDO);
		
		for (Adyacente vecino : v.getAdyacentes()) {
			if(tablaVisita.get(vecino.getDestino().getValor())==EstadoVisita.NO_VISITADO) {
				return dfs_visit(vecino.getDestino(),tablaVisita);
			} else if (tablaVisita.get(v.getValor()) == EstadoVisita.EXPLORANDO){
				return true;
			}
		}
		
		tablaVisita.put(v.getValor(), EstadoVisita.VISITADO);
		return false;		
	}
}
