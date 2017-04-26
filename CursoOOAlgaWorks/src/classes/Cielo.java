package classes;

import interfaces.Autorizavel;
import interfaces.Operadora;

public class Cielo implements Operadora{
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123");
	}
}