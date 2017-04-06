package classes;

public class Aeronave {
	
	public int totalAssentos;
	public int assentosReservados;
	
	public void reservarAssentos(int numeroAssentos) {
		assentosReservados += numeroAssentos;
	}
	
	public int calcularAssentosDisponiveis() {
		return totalAssentos - assentosReservados;
	}
}