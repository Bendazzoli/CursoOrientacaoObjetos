package com.curso.principal;

import com.curso.classes.JogoAdvinhacao;

public class PrincipalJogoAdivinhacao {

	public static void main(String[] args) {
		
		JogoAdvinhacao jogo = new JogoAdvinhacao();
		
		System.out.println("Sorteado um n�mero aleat�rio entre 1 e 100! Adivinha qual �!");
		
		jogo.jogar();
	}
}
