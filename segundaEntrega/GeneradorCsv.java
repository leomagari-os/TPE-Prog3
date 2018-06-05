package segundaEntrega;
import java.io.FileWriter;
import java.io.IOException;



	
public class GeneradorCsv {

	private String nombreDeArchivo=null;
	
	public GeneradorCsv() {
		
	}
	public void crearArchivoCSV(String nombreDeArchivo,Lista libros) {
		this.nombreDeArchivo=nombreDeArchivo;
		crearArchivoCSV(libros);
	}
	private  void crearArchivoCSV(Lista libros) {
		final String NEXT_LINE = "\n";
		try {
			FileWriter fw = new FileWriter(this.nombreDeArchivo);
			Nodo n=libros.getHead();
			while(n!=null) {
				fw.append(n.getInfo().getTitulo());
				fw.append(NEXT_LINE);
				n=n.getSiguiente();
				
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

		
	
