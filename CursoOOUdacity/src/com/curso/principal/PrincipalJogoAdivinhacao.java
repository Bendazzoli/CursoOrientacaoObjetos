package com.curso.principal;

import com.curso.classes.JogoAdvinhacao;

public class PrincipalJogoAdivinhacao {

	public static void main(String[] args) {
		
		JogoAdvinhacao jogo = new JogoAdvinhacao();
		
		System.out.println("Sorteado um número aleatório entre 1 e 100! Adivinha qual é!");
		
		jogo.jogar();
	}
}
