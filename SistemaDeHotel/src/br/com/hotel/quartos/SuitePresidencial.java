package br.com.hotel.quartos;

public class SuitePresidencial extends Quarto {

	public SuitePresidencial() {
		super(500.0, "Suite Presidencial"); //deefinindo o número por noite para um quarto de luxo
	}

	//Polimorfismo
	@Override
	public double calcularPreco(int numeroNoites, boolean cafeManha, boolean spa) {
		// TODO Auto-generated method stub
		double total = precoNoite * numeroNoites;

		if(cafeManha) {
			total += 20 * numeroNoites; //custo do café da manhã

		}
		if(spa) {
			total += 50 * numeroNoites; //adicionaa o valor do Spa
		}
		
		return total;
	}
	
}