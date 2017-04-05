package classes;

public class Carro {
	
	//Atributos, Propriedades, Caracteristicas ou ainda Variáveis de Instância
	String fabricante = "Sem Fabricante";
	String modelo = "Sem modelo";
	String cor = "Sem cor";
	String tipoCombustivel = "";
	int anoDeFabricacao = 1500;
	double valorDeMercado = 0;
	Proprietario dono = new Proprietario();
	
	public void ligar(){
		if(modelo != null){
			System.out.println("Ligando o carro " + modelo);
		}
	}
}