package exercicioUm;

import java.util.Arrays;
import java.util.List;

/**@author LUCAS_ROCHA*/
public class Program_04 {
	public static void main(String[] args) {
		
		/**
		 * API COLLECTIONS -> LAMBDAS
		 * EXEMPLOS
		 * */
        List<String> aprovados = Arrays.asList("LUCAS ROCHA", "ANNA CLARA", "LUCIENE JOSE", "VICENTE JOSE", "SAMUEL ROCHA", "MEIRIELLE ROCHA");
        System.out.println("Forma tradicional ....");
        for(String nome : aprovados)
        	System.out.println(nome);
        
        System.out.println("\nLambda #01");
        aprovados.forEach(e -> System.out.println(e + " !!!! "));
        
        System.out.println("\nMethod Reference ....");
        aprovados.forEach(System.out::println);
	}
}
