package com.curso.principal;

import java.io.FileNotFoundException;
import com.curso.classes.ContadorDePalavras;

public class ContadorDePalavrasPrincipal {
	
	private static final String arquivo = "src/ArquivoTextoComum.txt";
	
	public static void main(String[] args){
		ContadorDePalavras contador = new ContadorDePalavras();
		try {
			contador.contarPalavras(arquivo);
		} catch (FileNotFoundException e) {
			System.out.println("O arquivo '" + arquivo  + "' informado não existe.");
		}
	}
}