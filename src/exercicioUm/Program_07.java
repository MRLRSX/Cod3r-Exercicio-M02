package exercicioUm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program_07 {
	public static void main(String[] args) {
        
		/**
		 * TESTE MINHA FUNCTIONAL_INTERFACE USANDO GENERICS 
		 * */
		List<PessoaFisica> pessoas = new ArrayList<>();
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\lucas\\OneDrive\\Documentos\\Pessoa.txt"))){
			String linha = bufferedReader.readLine();
			while(linha != null) {
				String[] linhas = linha.split(",");
				pessoas.add(new PessoaFisica(linhas[1], linhas[0], Integer.parseInt(linhas[2].trim())));
				linha = bufferedReader.readLine();
			}
			
			
		}catch(IOException error) {
			error.printStackTrace();
		}
		
	    
		Exemplo<PessoaFisica> teste = P -> System.out.printf("Nome: %s - Idade: ( %d ) - CPF: %s  \n", P.getNome(), P.getIdade(), P.getCPF());
		pessoas.forEach(p -> teste.executar(p));
	}
    
}
