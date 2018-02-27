package com.curso.classes;

import java.util.Scanner;

public class JogoAdvinhacao {
	
	private boolean vencedor = false;
	private Integer numeroRandomico;
	
	private Integer retornaNumRandom(int limite){
		return (int) (Math.random() * limite) + 1;
	}
	
	private void mostraResultado(boolean vencedor, int numeroRandomico){
		if(vencedor){
			System.out.println("Parabéns! Você acertou!");
		}else{
			System.out.println("Fim de jogo. Você perdeu!");
			System.out.println("O número sorteado foi: " + numeroRandomico);
		}
	}
	
	public void jogar(){
		
		numeroRandomico = retornaNumRandom(100);
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i=10; i>0; i--){
			System.out.println("Você tem " + i + " tentativa(s)! Escolha um número: ");
			int valor = scanner.nextInt();
			
			if(valor < numeroRandomico ){
				System.out.println("O valor digitado (" + valor + ") é menor que o valor sorteado!");
			}else if(valor > numeroRandomico){
				System.out.println("O valor digitado (" + valor + ") é maior que o valor sorteado!");
			}else if(numeroRandomico == valor){
				vencedor = true;
				break;
			}
		}
		
		mostraResultado(vencedor, numeroRandomico);
	}
}