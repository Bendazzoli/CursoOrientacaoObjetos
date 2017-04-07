package classes;

public class Transferencia extends Transacao{
	
	private String contaOrigem;
	private String contaDestino;
	
	public void emitirComprovante(){
		System.out.println("+====================================+");
		System.out.println("|      Comprovante da transação      |");
		System.out.println("+====================================+");
		System.out.println("* Descrição: " + this.getDescricao());
		System.out.println("* Data: " + this.getData());
		System.out.println("* Valor: " + this.getValor());
		System.out.println("* Conta Origem: " + this.getContaOrigem());
		System.out.println("* Conta Destino: " + this.getContaDestino());
		System.out.println("+====================================+");
	}

	public String getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(String contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public String getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(String contaDestino) {
		this.contaDestino = contaDestino;
	}
}