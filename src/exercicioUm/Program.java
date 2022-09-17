package exercicioUm;

public class Program {
	public static void main(String[] args) {
       Calculo calculo = new Soma();
       System.out.println(calculo.executar(5.0, 2.0));
       
       calculo = new Multiplicar();
       System.out.println(calculo.executar(5.0, 2.0));
	}
}
