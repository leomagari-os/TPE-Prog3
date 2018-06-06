package primeraEntrega;



public class Test {
	public static void main(String[] args){
		ArbolBinario indiceGeneros=new ArbolBinario();
		String archivoEntrada="D:\\prog3\\dataset3.csv";
		String separador=",";
		String generoABuscar="terror";
		String archivoSalida="D:\\prog3\\dataset-"+generoABuscar+".csv";
		Timer t =new Timer();
		t.start();
		LectorCsv lector=new LectorCsv(archivoEntrada,separador);
		
		lector.getIndice(indiceGeneros);
		indiceGeneros.imprimir();
		
		Lista indiceLibros=indiceGeneros.getLibrosDelGenero(generoABuscar);
		
		if(indiceLibros==null) {
			System.out.println("El indice por el cual busca no coincide con el de los libros actuales.");
			System.out.println("El tiempo de ejecucion fue de:"+t.stop());
			System.out.println("Cantidad de comparaciones: "+Genero.getComparados());
		}else {
			System.out.println("Se encontraron libros que coinciden con su busqueda.");
			//indiceLibros.imprimir();
			GeneradorCsv gen= new GeneradorCsv();
			gen.crearArchivoCSV(archivoSalida, indiceLibros);
			System.out.println("El tiempo de ejecucion fue de:"+t.stop());
			System.out.println("Cantidad de comparaciones(Creacion de indices): "+Genero.getComparados());
			System.out.println("Cantidad de comparaciones(Obtener indice): "+indiceGeneros.getCompBusqueda());
			System.out.println("Cantidad de generos: "+indiceGeneros.getCantGeneros());
		}
		
	}
}
