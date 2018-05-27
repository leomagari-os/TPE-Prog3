package primeraEntrega;



public class Test {
	public static void main(String[] args){
		ArbolBinario indiceGeneros=new ArbolBinario();
		String archivoEntrada="H:\\tpe_prog3\\datasets-1ra etapa\\dataset3.csv";
		String separador=",";
		String generoABuscar="terror";
		String archivoSalida="H:\\tpe_prog3\\datasets-1ra etapa"+generoABuscar+".csv";
		Timer t =new Timer();
		t.start();
		LectorCsv lector=new LectorCsv(archivoEntrada,separador);
		lector.getIndice(indiceGeneros);
		indiceGeneros.imprimir();
		
		
		
		
		
		Lista indiceLibros=indiceGeneros.getLibrosDelGenero(generoABuscar);
		if(indiceLibros==null) {
			System.out.println("El indice por el cual busca no coincide con el de los libros actuales.");
			System.out.println("El tiempo de ejecucion fue de:"+t.stop());
		}else {
			System.out.println("Se encontraron libros que coinciden con su busqueda.");
			//indiceLibros.imprimir();
			GeneradorCsv gen= new GeneradorCsv();
			gen.crearArchivoCSV(archivoSalida, indiceLibros);
			System.out.println("El tiempo de ejecucion fue de:"+t.stop());
			
		}
		
	}
}
