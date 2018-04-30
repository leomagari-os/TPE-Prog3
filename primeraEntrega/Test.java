package primeraEntrega;



public class Test {
	public static void main(String[] args){
		String archivoEntrada="H:\\\\tpe_prog3\\datasets-1ra etapa\\dataset1.csv";
		String separador=",";
		String generoABuscar="fotografía";
		String archivoSalida="H:\\\\tpe_prog3\\datasets-1ra etapa\\LibrosDelGenero"+generoABuscar+".csv";
		LectorCsv lector=new LectorCsv(archivoEntrada,separador);
		ColeccionLibros libros=new ColeccionLibros();
		libros.setLibros(lector.getLibros());
		Lista indiceLibros=libros.getLibrosPorGenero(generoABuscar);
		if(indiceLibros==null) {
			System.out.println("El indice por el cual busca no coincide con el de los libros actuales.");
		}else {
			System.out.println("Se encontraron libros que coinciden con su busqueda.");
			indiceLibros.imprimir();
			GeneradorCsv gen= new GeneradorCsv();
			gen.crearArchivoCSV(archivoSalida, indiceLibros);
			
		}
		
	}
}
