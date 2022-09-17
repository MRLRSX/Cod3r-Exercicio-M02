package exercicioUm;

import java.util.Arrays;
import java.util.List;

public class Program_05 {
	public static void main(String[] args) {
		/**
		 * API COLLECTIONS -> LAMBDAS EXEMPLOS
		 */
		List<String> aprovados = Arrays.asList("LUCAS ROCHA", "ANNA CLARA", "LUCIENE JOSE", "VICENTE JOSE",
				"SAMUEL ROCHA", "MEIRIELLE ROCHA");
		
		System.out.println("\nLambda #02");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference #02");
		aprovados.forEach(Program_05::meuImprimir);
		
	}
	

	
	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome e: " + nome);
	}
}
