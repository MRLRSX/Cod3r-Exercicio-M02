package exercicioUm;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
       
		Predicate<Produto> exemplo = p ->   (p.getPreco() * (1 -  p.getDesconto())) >= 1500.00;
		String teste01 = exemplo.test(new Produto("NOTEBOOK", 1500.00, 0.15)) == false ? "BARATO !!!! " : "CARO !!!!";
		System.out.println(teste01);
	
		String teste02 = exemplo.test(new Produto("NOTEBOOK", 2000.00, 0.15)) == false ? "BARATO !!!! " : "CARO !!!!";
	    System.out.println(teste02);
	}
}
