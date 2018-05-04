package primeraEntrega;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



	
public class GeneradorCsv {

	private String nombreDeArchivo=null;
	
	public GeneradorCsv() {
		
	}
	public void crearArchivoCSV(String nombreDeArchivo,ArrayList<Libro> libros) {
		this.nombreDeArchivo=nombreDeArchivo;
		crearArchivoCSV(libros);
	}
	private  void crearArchivoCSV(ArrayList<Libro> libros) {
		final String NEXT_LINE = "\n";
		try {
			FileWriter fw = new FileWriter(this.nombreDeArchivo);
			for(int i=0;i<libros.size();i++){
				Libro l=libros.get(i);
				fw.append(l.getTitulo());
				fw.append(NEXT_LINE);
			}

			fw.flush();
			fw.close();
			System.out.println("Se creo el Archivo '"+this.nombreDeArchivo+"' con el nombre de los libros.");
			
		} catch (IOException e) {
				// Error al crear el archivo, por ejemplo, el archivo 
				// está actualmente abierto.
				e.printStackTrace();
		}
	}

}

		
	
