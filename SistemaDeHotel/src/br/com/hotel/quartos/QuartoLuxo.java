package br.com.hotel.quartos;

public class QuartoLuxo extends Quarto{

	public QuartoLuxo() {
		super(250.0, "Quarto Luxo"); //deefinindo o número por noite para um quarto de luxo
	}

	//Polimorfismo
	@Override
	public double calcularPreco(int numeroNoites, boolean cafeManha, boolean spa) {
		// TODO Auto-generated method stub
		double total = precoNoite * numeroNoites;
		
		if(cafeManha) {
			total += 20 * numeroNoites; //Custo do cafe da manhã

		}
		if(spa) {
			total += 50 * numeroNoites; //Add o valor dospa
		}
		
		return total;
	}
	
}