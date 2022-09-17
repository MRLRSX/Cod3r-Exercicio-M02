package exercicioUm;

import java.util.Arrays;
import java.util.List;

public class Program_04 {
	public static void main(String[] args) {
		
		/**
		 * API COLLECTIONS -> LAMBDAS
		 * */
        List<String> aprovados = Arrays.asList("LUCAS ROCHA", "ANNA CLARA", "LUCIENE JOSE", "VICENTE JOSE", "SAMUEL ROCHA", "MEIRIELLE ROCHA");
        aprovados.forEach(e -> System.out.println(e + " !!!! "));
	}
}
