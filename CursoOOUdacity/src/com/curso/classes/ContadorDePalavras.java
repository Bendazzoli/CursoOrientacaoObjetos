package com.curso.classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContadorDePalavras {

	public void contarPalavras(String caminhoArquivo) throws FileNotFoundException{
		File arquivo = new File(caminhoArquivo);
		Scanner scanner = new Scanner(arquivo);
			
		int qtdePalavras = 0;
			
		while(scanner.hasNextLine()){
			String linha = scanner.nextLine();
			qtdePalavras += linha.split(" ").length;
		}
		
		System.out.println("O arquivo possui " + qtdePalavras + " palavras.");
	}
}
