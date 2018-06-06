package segundaEntrega;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Vertice {
	private ArrayList<Arista> adyacentes;
	private String etiqueta;
	public Vertice(String e){
		this.etiqueta=e;
		this.adyacentes=new ArrayList<Arista>();
	}
	public int addAdyacente(Vertice v, int p){
		Arista a=containsAdyacente(v);
		if(a!=null){
			a.contarArista();
			return 0;
		}else{
			a=new Arista(this, v, p);
			this.adyacentes.add(a);
			return 1;
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
		String res="";
		for (int i = 0; i < this.adyacentes.size(); i++) {
			Arista actual=this.adyacentes.get(i);
			res+=this.etiqueta+" -> "+actual.getDestino().getEtiqueta()+"[label=\""+actual.getPeso()
					+".0\",weight=\""+actual.getPeso()+".0\"];\n";
		}
		return res;
	}
	public ArrayList<Arista> getGenerosMasBuscados(int n){
		ArrayList<Arista>res=new ArrayList<Arista>();
		if(this.adyacentes.size()<=n){
			return this.adyacentes;
		}else{
			Collections.sort(this.adyacentes, new Comparator<Arista>() {//compara por peso
		        @Override
		        public int compare(Arista a1, Arista a2){
		            return  a1.compareTo(a2);
		        }
		    });
			
			for (int i = 1; i < n+1; i++) {
				res.add(this.adyacentes.get(this.adyacentes.size()-i));
			}
		}
		
		return res;
	}
	public ArrayList<Arista> getAdyacentes() {
		return this.adyacentes;
	}
}
