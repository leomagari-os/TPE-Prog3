package segundaEntrega;

import java.util.ArrayList;

public class Vertice {
	private ArrayList<Arista> adyacentes;
	private String etiqueta;
	public Vertice(String e){
		this.etiqueta=e;
		this.adyacentes=new ArrayList<Arista>();
	}
	public void addAdyacente(Vertice v, int p){
		Arista a=containsAdyacente(v);
		if(a!=null){
			a.contarArista();
		}else{
			a=new Arista(this, v, p);
			this.adyacentes.add(a);
		}
	}
	
	public String getEtiqueta(){
		return this.etiqueta;
	}
	public Arista containsAdyacente(Vertice v){
		for (int i = 0; i < this.adyacentes.size(); i++) {
			if(this.adyacentes.get(i).getDestino().getEtiqueta().equals(v.getEtiqueta())){
				return this.adyacentes.get(i);
			}
		}
		return null;
	}
	public String toString(){
		String res="Vertice: "+this.etiqueta+"\n";
		res+="Adyacentes:\n";
		for (int i = 0; i < this.adyacentes.size(); i++) {
			res+=this.adyacentes.get(i).getDestino().getEtiqueta()+"\n";
		}
		return res;
	}
}
