package exercicioUm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
      
		List<Produto> produtos = new ArrayList<>();
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\lucas\\OneDrive\\Documentos\\produto.txt"))){
			String linha = bufferedReader.readLine();
			while(linha != null) {
				String[] linhas = linha.split(",");
				produtos.add(new Produto(linhas[1], Double.parseDouble(linhas[1].trim()), Double.parseDouble(linhas[2].trim())));
				linha = bufferedReader.readLine();
			}
			
			
		}catch(IOException error) {
			error.printStackTrace();
		}
		
		Consumer<Produto> imprimir = p -> System.out.printf("NOME: %s PREÇO %.2f PREÇO C/DESCONTO %.2f \n", p.getNome(), p.getPreco(), (p.getPreco() * (1 -  p.getDesconto())));
		produtos.forEach(imprimir);
	}
}
