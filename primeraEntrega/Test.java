package primeraEntrega;



public class Test {
	public static void main(String[] args){
		String archivoEntrada="D:\\prog3\\dataset4.csv";
		String separador=",";
		String generoABuscar="novela";
		String archivoSalida="D:\\prog3\\LibrosDelGenero"+generoABuscar+".csv";
		LectorCsv lector=new LectorCsv(archivoEntrada,separador);
		Timer t =new Timer();
		ColeccionLibros libros=new ColeccionLibros();
		t.start();
		libros.setLibros(lector.getLibros());
		Lista indiceLibros=libros.getLibrosPorGenero(generoABuscar);
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
