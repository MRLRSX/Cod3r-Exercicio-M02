package exercicioUm;

/**@author LUCAS ROCHA */

public class Program_02 {
	public static void main(String[] args) {

		/**
		 *  POLIMORFISMO USANDO INTERFACE E LAMBDA
		 *  DEFAULT METHOD
		 * */
		
		Calculo soma = (x, y) -> { return x + y; };
		System.out.println(soma.executar(5.0, 2.0));
		
		soma = (x, y) -> x * y ;
		System.out.println(soma.executar(5.0, 3.0));
		
		System.out.println(soma.legal());
		
		System.out.println(Calculo.muitoLegal());
		
	}
}
