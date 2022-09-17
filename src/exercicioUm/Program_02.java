package exercicioUm;

public class Program_02 {
	public static void main(String[] args) {

		/**
		 *  POLIMORFISMO USANDO INTERFACE E LAMBDA
		 *  
		 * */
		
		Calculo soma = (x, y) -> { return x + y; };
		System.out.println(soma.executar(5.0, 2.0));
		
		soma = (x, y) -> x * y ;
		System.out.println(soma.executar(5.0, 3.0));
		
		
	}
}
