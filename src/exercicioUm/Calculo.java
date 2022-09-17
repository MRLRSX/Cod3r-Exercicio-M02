package exercicioUm;

@FunctionalInterface
public interface Calculo {
   
	public abstract double executar(double a, double b);
	
	default String legal() {
		return "Exemplo: Default method Interface";
	}
	
	static String muitoLegal() {
		return "Muito Legal";
	}
}
