package exercicioUm;

import java.util.function.BinaryOperator;

public class Program_03 {
	public static void main(String[] args) {
       
		/**
		 * OLHAR ORACLE UTIL FUNCTION 
		 * */
		
		BinaryOperator<Double> calc = (x, y) -> x + y;
		System.out.println(calc.apply(5.0, 10.0));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(10.0, 5.0));
	}
}
