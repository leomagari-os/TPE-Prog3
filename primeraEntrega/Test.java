package primeraEntrega;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args){
		String archivoEntrada="H:\\\\tpe_prog3\\datasets-1ra etapa\\dataset1.csv";
		String archivoSalida="";
		String separador=",";
		String generoABuscar="fotografía";
		LectorCsv lector=new LectorCsv(archivoEntrada,separador);
		ArrayList<Libro>libros=lector.getLibros();
		
		for (int i = 0; i < libros.size(); i++) {
			System.out.println(libros.get(i).getGeneros());
		}
		
	}
}
