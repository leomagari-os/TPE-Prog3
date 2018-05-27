package primeraEntrega;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LectorCsv {

	private String csvFile = "";
	private String line = "";
	private String cvsSplitBy = ",";
	private BufferedReader br;
	
	public LectorCsv(String file,String splitBy){
		this.csvFile=file;
		this.cvsSplitBy=splitBy;
		try{
			this.br = new BufferedReader(new FileReader(csvFile));
		} catch (IOException e) {
	            e.printStackTrace();
	        
		}
	
	}
	public void getIndice(ArbolBinario indice){
		Lista res =new Lista();
		
		try{ 		
            line = this.br.readLine();//para quitar linea con titulos
            line = this.br.readLine();
        	while(line!=null) {
        		String[] linea= line.split(cvsSplitBy);
       			//Libro l=new Libro(linea[0],linea[1],new Integer(linea[2]).intValue(),linea[3]);
        		Libro l=new Libro(linea[0],linea[1],new Integer(linea[2]).intValue());
        		String[] generos= linea[3].split(" ");
        		for(int i=0;i<generos.length;i++) {
        			Genero g =new Genero(generos[i]);
        			indice.insertarLibroEnGenero(l,g);
        		}
        		res.insertar(l);
       			line = br.readLine();
       			
       		}
    	} catch (IOException e) {
	            e.printStackTrace();
		}    // use comma as separator
                


       
//        return res;

    }


		
	
	
	
}
