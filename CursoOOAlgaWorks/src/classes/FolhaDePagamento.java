package classes;

public class FolhaDePagamento {
	
	public double calcularSalario(int horasNormais, int horasExtras, double valorHoraNormal, double valorHoraExtra){
		
		double valorHorasNormais = horasNormais * valorHoraNormal;
		double valorHorasExtras = horasExtras * valorHoraExtra;
		
		return valorHorasNormais + valorHorasExtras;
	}
}