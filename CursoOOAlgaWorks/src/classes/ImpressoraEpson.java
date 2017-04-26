package classes;

import interfaces.Impressora;
import interfaces.Imprimivel;

public class ImpressoraEpson implements Impressora{
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("* * * * * * * * * * * * * * * * * *");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("* * * * * * * * * * * * * * * * * *");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println("- - - - - - - - - - - - - - - - - -");
		System.out.println("==             EPSON             ==");
		System.out.println("- - - - - - - - - - - - - - - - - -");
		}
}