package classes;

public class Principal {
	
	public static void main(String[] args){
		
		Proprietario dono1 = new Proprietario();
		dono1.nome = "João Do Código";
		dono1.cpf = "111.222.333-44";
		dono1.idade = 30;
		dono1.logradouro = "Rua das Canelas, 10";
		dono1.bairro = "Centro";
		dono1.cidade = "Ciriema/SP";
		
		Carro meuCarro = new Carro();
		meuCarro.fabricante = "CHEVROLET";
		meuCarro.modelo = "ONIX LS";
		meuCarro.cor = "Branco";
		meuCarro.tipoCombustivel = "Flex";
		meuCarro.anoDeFabricacao = 2016;
		meuCarro.valorDeMercado = 35000.0;
		meuCarro.dono = dono1;
	}
}