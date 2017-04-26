package interfaces;

import classes.Cartao;

public interface Operadora {
	
	boolean autorizar(Autorizavel autorizavel, Cartao cartao);
}