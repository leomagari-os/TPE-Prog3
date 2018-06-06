package segundaEntrega;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;





public class Grafo {
	private ArrayList<Vertice> vertices;
	private Hashtable<String, EstadoVisita> tablaVisita;
	private int cantidadAristas;
	public Grafo(){
		this.vertices=new ArrayList<Vertice>();
		this.cantidadAristas=0;
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
		this.cantidadAristas+=o.addAdyacente(d, 1);
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
	
	public ArrayList<Vertice> generosBuscadosAfter(Vertice v){
		ArrayList<Vertice> res=new ArrayList<Vertice>();
		v=getVertice(v.getEtiqueta());
		this.tablaVisita=new Hashtable<String, EstadoVisita>();
		for (int i = 0; i < this.vertices.size(); i++) {
			tablaVisita.put(this.vertices.get(i).getEtiqueta(), EstadoVisita.NO_VISITADO);
		}
		if(v==null){
			return null;
		}
		String notGenero=v.getEtiqueta();
		generosBuscadosAfter(v, tablaVisita,res,notGenero);	
		return res;
	}
	private void generosBuscadosAfter(Vertice v, Hashtable<String, EstadoVisita> tablaVisita,ArrayList<Vertice> res,String notGenero) {
		//busco por dfs
		tablaVisita.put(v.getEtiqueta(), EstadoVisita.EXPLORANDO);
		
		for (Arista ady : v.getAdyacentes()) {
			if(tablaVisita.get(ady.getDestino().getEtiqueta())==EstadoVisita.NO_VISITADO) {
				generosBuscadosAfter(getVertice(ady.getDestino().getEtiqueta()),tablaVisita,res,notGenero);
			} else if (tablaVisita.get(v.getEtiqueta()) == EstadoVisita.EXPLORANDO){
				//ciclo
			}
		}
		if(!v.getEtiqueta().equals(notGenero)){
			res.add(v);
		}
		tablaVisita.put(v.getEtiqueta(), EstadoVisita.VISITADO);
				
	}
	public Grafo getGrafoGenerosAfines(){
		Grafo res=new Grafo();
		ArrayList<String> noVisitados=new ArrayList<String>();
		for (int i = 0; i < this.vertices.size(); i++) {
			Vertice o= this.vertices.get(i);
			generosBuscadosAfter(o);	
			String s=filtrarVisitados();
			if(s!=null){
				noVisitados.add(s);
			}
			//si no lo visita no se incluye en el grafo
			
		}
		for (int i = 0; i < this.vertices.size(); i++) {
			Vertice v=this.vertices.get(i);
			if(!noVisitados.contains(v.getEtiqueta())){
				res.addVertice(v);
			}
		}
		return res;
	}
	private String filtrarVisitados() {
		// TODO Auto-generated method stub
		
		Iterator<String> it=this.tablaVisita.keySet().iterator();
		while(it.hasNext()){
			String k=it.next();
			if(this.tablaVisita.get(k).equals(EstadoVisita.NO_VISITADO)){
				return k;
			}
			
		}
		return null;
	}
	public int getCantidadAristas(){
		return this.cantidadAristas;
	}
}
