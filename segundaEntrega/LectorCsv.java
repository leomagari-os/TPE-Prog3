package segundaEntrega;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LectorCsv {

	private String csvFile = "";
	private String line = "";
	private String cvsSplitBy = ",";
	private BufferedReader br;
	private int cantidadBusquedas;
	
	public LectorCsv(String file,String splitBy){
		this.csvFile=file;
		this.cvsSplitBy=splitBy;
		this.cantidadBusquedas=0;
		try{
			this.br = new BufferedReader(new FileReader(csvFile));
		} catch (IOException e) {
	            e.printStackTrace();
	        
		}
	
	}
	
	public void getBusquedas(Grafo g){
		try{ 		
            line = this.br.readLine();//para quitar linea con titulos
            line = this.br.readLine();
            
        	while(line!=null) {
        		String[] generos= line.split(cvsSplitBy);
        		this.cantidadBusquedas+=generos.length;
        		g.addVertice(new Vertice(generos[0]));
        		for(int i=1;i<generos.length;i++) {
        			Vertice actual=new Vertice(generos[i]);
        			g.addVertice(actual);
        			g.addArista(generos[i-1],actual.getEtiqueta());//Vinculo vertice actual con anterior
        		}
        		line = br.readLine();
       			
       		}
    	} catch (IOException e) {
	            e.printStackTrace();
		}    // use comma as separator

	}
	
	public int getCantBusquedas(){
		return this.cantidadBusquedas;
	}

		
	
	
	
}
