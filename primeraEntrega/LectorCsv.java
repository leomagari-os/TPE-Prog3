package primeraEntrega;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
	public ArrayList<Libro> getLibros(){
		ArrayList<Libro> res =new ArrayList<Libro>();
		ArrayList<Libro> libros=new ArrayList<Libro>();
		try{ 		
            line = this.br.readLine();//para quitar linea con titulos
            line = this.br.readLine();
        	while(line!=null) {
        		String[] linea= line.split(cvsSplitBy);
       			Libro l=new Libro(linea[0],linea[1],new Integer(linea[2]).intValue(),linea[3]);
       			libros.add(l);
       			line = br.readLine();
       			
       		}
    	} catch (IOException e) {
	            e.printStackTrace();
		}    // use comma as separator
                res = libros;


       
        return res;

    }


		
	
	
	
}
