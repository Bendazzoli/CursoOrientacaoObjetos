package classes;

public class Principal {
	
	public static void main(String[] args){
		Carro meuCarro = new Carro();
		meuCarro.fabricante = "CHEVROLET";
		meuCarro.modelo = "ONIX LS";
		meuCarro.cor = "Branco";
		meuCarro.tipoCombustivel = "Flex";
		meuCarro.anoDeFabricacao = 2016;
		meuCarro.valorDeMercado = 35000.0;
		
		Carro seuCarro = new Carro();
		seuCarro.fabricante = "CHEVROLET";
		seuCarro.modelo = "SPIN LT";
		seuCarro.cor = "Preto";
		seuCarro.tipoCombustivel = "Flex";
		seuCarro.anoDeFabricacao = 2017;
		seuCarro.valorDeMercado = 75000.0;
		
		System.out.println("Meu Carro");
		System.out.println("-------------------------");
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano: " + meuCarro.anoDeFabricacao);
		System.out.println();
		System.out.println("Seu Carro");
		System.out.println("-------------------------");
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Ano: " + seuCarro.anoDeFabricacao);
	}
}