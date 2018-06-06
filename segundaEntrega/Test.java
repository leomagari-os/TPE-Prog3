package segundaEntrega;

import java.util.ArrayList;



public class Test {
	public static void main(String[] args){
		
		String archivoEntrada="D:\\prog3\\dataset-2da-parte\\dataset1.csv";
		String separador=",";
		String generoABuscar="viajes";

		LectorCsv lector=new LectorCsv(archivoEntrada,separador);
		Grafo g=new Grafo();
		lector.getBusquedas(g);

//		System.out.println(g.getCantVertices());//para controlar cantidad total vs cantidad del testeo actual
		
//		System.out.println("Servicio 1");
//		int n=11;
//		ArrayList<Arista> res=g.getGenerosMasBuscados(new Vertice(generoABuscar),n);//servicio 1
//		if(res.size()==0){
//			System.out.println("Se ingreso un genero erroneo o el genero no tiene busquedas siguientes asociadas.");
//		}else{
//			for (int i = 0; i < res.size(); i++) {
//				System.out.println(res.get(i).getOrigen().getEtiqueta()+"->"+res.get(i).getDestino().getEtiqueta()+" Peso: "+res.get(i).getPeso());
//			}
//		}
//		
//		System.out.println("Servicio 2");
//		ArrayList<Vertice> res=g.generosBuscadosAfter(new Vertice(generoABuscar));//servicio2
//		
//		if(res!=null){
//			for (int i = 0; i < res.size(); i++) {
//				System.out.println(res.get(i).getEtiqueta());
//			}
//			System.out.println(res.size());
//		}else{
//			System.out.println("El genero por el que busca no existe o no tiene vinculada mas busquedas.");
//		}
//		
//		System.out.println("Servicio 3");
//		Grafo res=g.getGrafoGenerosAfines();
//		System.out.println("Cantidad de vertices original: "+g.getCantVertices());
//		System.out.println("Cantidad de vertices Grafo afin: "+res.getCantVertices());
//		System.out.println(res);

		
//otros tests		
//		System.out.println(g);
//		System.out.println("Cantidad de Aristas"+g.getCantidadAristas());
//		System.out.println("Cantidad de Busquedas"+lector.getCantBusquedas());
	}
}
