package segundaEntrega;

import java.util.ArrayList;



public class Test {
	public static void main(String[] args){
		
		String archivoEntrada="D:\\prog3\\dataset-2da-parte\\dataset1.csv";
		String separador=",";
		String generoABuscar="arte";
//		Timer t =new Timer();
//		t.start();
		LectorCsv lector=new LectorCsv(archivoEntrada,separador);
		Grafo g=new Grafo();
		lector.getBusquedas(g);

		System.out.println(g.getCantVertices());
		
//		System.out.println("Servicio 1");
//		ArrayList<Arista> res=g.getGenerosMasBuscados(new Vertice(generoABuscar),11);//servicio 1
//		for (int i = 0; i < res.size(); i++) {
//			System.out.println(res.get(i).getOrigen().getEtiqueta()+"->"+res.get(i).getDestino().getEtiqueta()+" Peso: "+res.get(i).getPeso());
//		}
		
		System.out.println("Servicio 2");
		ArrayList<Arista> res=g.getAllGenerosAfter(new Vertice(generoABuscar));//servicio2
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i).getOrigen().getEtiqueta()+"->"+res.get(i).getDestino().getEtiqueta()+" Peso: "+res.get(i).getPeso());
		}

		
	}
}
