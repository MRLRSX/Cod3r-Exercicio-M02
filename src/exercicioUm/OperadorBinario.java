package exercicioUm;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	public static void main(String[] args) {
		
       BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
       System.out.println(media.apply(10.0, 6.0));
       
       BiFunction<Double, Double, String> resultado = (n1, n2) -> (n1 + n2) / 2 > 7.0 ? "APROVADO" : "REPROVADO";
       System.out.println(resultado.apply(8.0, 7.0));
       
       Function<Double, String> exemplo = p -> p >= 7 ? "APROVADO" : "REPROVADO";
       System.out.println(media.andThen(exemplo).apply(8.0, 9.0));       
	}
}
