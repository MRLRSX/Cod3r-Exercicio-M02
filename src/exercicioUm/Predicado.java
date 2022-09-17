package exercicioUm;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
       
		Predicate<Produto> exemplo = p ->   (p.getPreco() * (1 -  p.getDesconto())) >= 1500.00;
		String teste01 = exemplo.test(new Produto("NOTEBOOK", 1500.00, 0.15)) == false ? "BARATO !!!! " : "CARO !!!!";
		System.out.println(teste01);
	
		String teste02 = exemplo.test(new Produto("NOTEBOOK", 2000.00, 0.15)) == false ? "BARATO !!!! " : "CARO !!!!";
	    System.out.println(teste02);
	    
	    Consumer<Produto> teste03 = p -> System.out.printf("NOME: "+ p.getNome()+ " PREÇO " + p.getPreco()+ " PREÇO C/DESCONTO " + (p.getPreco() * (1 -  p.getDesconto())));
	    teste03.accept(new Produto("IPHONE 11", 3500.00, 0.1));
	    
	    
	    
	    
	}
}
