package exercicioUm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program_06 {
	public static void main(String[] args) {
		
		
		
		 Map<String, Integer> candidates = new HashMap<>();
	       try(BufferedReader bufferReader = new BufferedReader(new FileReader("C:\\Users\\lucas\\OneDrive\\Documentos\\vota.txt"))){
		    	 String lines = bufferReader.readLine();
		    	 
		    	 while(lines != null) {
		    		 String[] line = lines.split(",");
		    		 if(candidates.containsKey(line[0])) {
		    			 int accumulator = candidates.get(line[0]);
		    			 candidates.put(line[0],accumulator + Integer.parseInt(line[1]));
		    			 
		    		 }else {
		    			 candidates.put(line[0], Integer.parseInt(line[1]));		    			 
		    		 }
		    		 lines = bufferReader.readLine();
		    	 }
		     }catch(IOException errorCapturado){
		    	 errorCapturado.printStackTrace();
		     }
	       
	       candidates.forEach(Program_06::meuImprimir);
	}
	
	static void meuImprimir(String name, Integer voto){
		System.out.printf("\n%s  %d\n ", name, voto);
		
	}
}
