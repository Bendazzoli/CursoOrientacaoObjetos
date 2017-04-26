package classes;

import interfaces.Impressora;
import interfaces.Operadora;


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
		meuCarro.modelo = "Onix";
		meuCarro.cor = "Branco";
		meuCarro.tipoCombustivel = "Flex";
		meuCarro.anoDeFabricacao = 2016;
		meuCarro.valorDeMercado = 35000.0;
		meuCarro.dono = dono1;
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "Civic";
		
		meuCarro.ligar();
		seuCarro.ligar();
		
		Paciente p = new Paciente();
		p.peso = 78;
		p.altura = 1.73;
		
		IMC imc = p.calcularIMC();
		
		System.out.println("Abaixo peso ideal: " + imc.abaixoDoPesoIdeal);
		System.out.println("Peso ideal: " + imc.pesoIdeal);
		System.out.println("Obeso: " + imc.obeso);
		System.out.println("Grau de obesidade: " + imc.grauObesidade);
		
		
		FolhaDePagamento folha = new FolhaDePagamento();
		double salario = folha.calcularSalario(160, 12, 32.5, 40.2);
		System.out.println("Salário total: " + salario);
		
		
		Preco preco = new Preco();
		preco.valorCustos = 140;
		Produto produto = new Produto();
		produto.definirPreco(preco, 20, 15);
		System.out.println("Valor de custo: " + preco.valorCustos);
		System.out.println("Valor de impostos: " + preco.valorImpostos);
		System.out.println("Valor de lucro: " + preco.valorLucro);
		System.out.println("Preço de venda: " + preco.precoVenda);
		
		
		Aeronave aviaoGol = new Aeronave();
		aviaoGol.totalAssentos = 100;
		Aeronave aviaoLatam = new Aeronave();
		aviaoLatam.totalAssentos = 130;
		aviaoGol.reservarAssentos(10);
		aviaoLatam.reservarAssentos(5);
		int assentosGol = aviaoGol.calcularAssentosDisponiveis();
		int assentosLatam = aviaoLatam.calcularAssentosDisponiveis();
		System.out.println("Assentos disponíveis - Gol: " + assentosGol);
		System.out.println("Assentos disponíveis - Azul: " + assentosLatam);
		
		@SuppressWarnings("unused")
		Cliente cliente = new Cliente("João das Couves","12312312312");
		
		
		Transacao pagtoBoleto = new PagamentoBoleto("Condomínio", 450, "26/08/2013", "1234 1234 1234", "27/08/2013", "Edifício da Praça Redonda");
		Transacao transferencia = new Transferencia("Aluguel", 1500, "10/08/2013", "0001000123", "0001000965");
		EmissorDeComprovantes emissor = new EmissorDeComprovantes();
		emissor.emitirComprovantes(transferencia, pagtoBoleto);
		
		System.out.println("");
		System.out.println("");
		//Cartão
		Operadora operadora = new Cielo();
		Impressora impressora = new ImpressoraEpson();
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("João M Couves");
		cartao.setNumeroCartao("123");
		
		Compra compra = new Compra();
		compra.setNomeCliente("João Mendonça Couves");
		compra.setProduto("Sabonete");
		compra.setValorTotal(2.5);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
		
		System.out.println("");
		System.out.println("");
		Operadora operadora2 = new Redecard();
		Impressora impressora2 = new ImpressoraXingLing();
		Cartao cartao2 = new Cartao();
		cartao2.setNomeTitular("João M Couves");
		cartao2.setNumeroCartao("456");
		Compra compra2 = new Compra();
		compra2.setNomeCliente("João Mendonça Couves");
		compra2.setProduto("Sabonete");
		compra2.setValorTotal(100);
		Checkout checkout2 = new Checkout(operadora2, impressora2);
		checkout2.fecharCompra(compra2, cartao2);
	}
}