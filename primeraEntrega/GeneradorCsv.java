package primeraEntrega;
import java.io.FileWriter;
import java.io.IOException;



	
public class GeneradorCsv {
	private String separador;
	
	
	public GeneradorCsv(String separador) {
		this.separador=separador;
	}
	public void crearArchivoCSV(String nombreDeArchivo,String[] libros) {
		crearArchivoCSV(nombreDeArchivo, this.separador,libros);
	}
	private  void crearArchivoCSV(String nombreArchivo, String separador,String[]libros) {
		final String NEXT_LINE = "\n";
		try {
			FileWriter fw = new FileWriter(nombreArchivo);
			fw.append("testing").append(separador);
			fw.append(NEXT_LINE);
			fw.flush();
			fw.close();
		} catch (IOException e) {
				// Error al crear el archivo, por ejemplo, el archivo 
				// está actualmente abierto.
				e.printStackTrace();
		}
	}

}

		
	
