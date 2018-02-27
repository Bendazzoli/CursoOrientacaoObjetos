package com.curso.classes;

import java.io.File;
import java.util.Scanner;

public class ContadorDePalavras {

	public void contarPalavras(String caminhoArquivo) throws Exception{
		File arquivo = new File(caminhoArquivo);
		if(arquivo.exists()){
			Scanner scanner = new Scanner(arquivo);
			
			int qtdePalavras = 0;
			
			while(scanner.hasNextLine()){
				String linha = scanner.nextLine();
				qtdePalavras += linha.split(" ").length;
			}
			
			System.out.println("O arquivo possui " + qtdePalavras + " palavras.");
		}else{
			System.out.println("O arquivo '" + caminhoArquivo + "' informado não existe!");
		}
		
	}
}
