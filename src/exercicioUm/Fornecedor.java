package exercicioUm;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	public static void main(String[] args) {
      
		Supplier< List<String>> umList = () -> Arrays.asList("Onde eu vou aplicar isso", " bem desnecessario", "bem chato");
		System.out.println(umList.get().toString());
	
	}
}
