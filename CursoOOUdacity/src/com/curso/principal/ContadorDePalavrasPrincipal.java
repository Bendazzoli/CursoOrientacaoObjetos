package com.curso.principal;

import com.curso.classes.ContadorDePalavras;


public class ContadorDePalavrasPrincipal {
	
	public static void main(String[] args) throws Exception{
		ContadorDePalavras contador = new ContadorDePalavras();
		contador.contarPalavras("src/ArquivoTextoComum.txt");
	}
}