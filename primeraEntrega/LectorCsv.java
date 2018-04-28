package primeraEntrega;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorCsv {

	private String csvFile = "";
	private String line = "";
	private String cvsSplitBy = ",";
	public LectorCsv(String file,String splitBy){
		this.csvFile=file;
		this.cvsSplitBy=splitBy;
	
	}
	public String[] getLine(){
		String[] res =null;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

           if((line = br.readLine()) != null) {

                // use comma as separator
                res = line.split(cvsSplitBy);


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;

    }


		
	
	
	
}
