package classes;

public class Principal {
	
	public static void main(String[] args){
		Carro meuCarro = new Carro();
		
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano: " + meuCarro.anoDeFabricacao);
	}
}