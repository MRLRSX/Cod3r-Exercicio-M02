package exercicioUm;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
       UnaryOperator<String> nome = p -> p + "LUCAS";
       UnaryOperator<String> sobreNome = p -> p + " ROCHA ";
       UnaryOperator<String> ultimoNome = p -> p + "DOS SANTOS";
       
       System.out.println(nome.andThen(sobreNome).andThen(ultimoNome).apply("OLA - "));
       
       System.out.println(ultimoNome.compose(sobreNome).compose(nome).apply("FALA MEU AMIGO "));
	}
}
