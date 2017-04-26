package classes;

import interfaces.Autorizavel;
import interfaces.Operadora;

public class Redecard implements Operadora{
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("456")
		&& autorizavel.getValorTotal() < 200;
		}
}