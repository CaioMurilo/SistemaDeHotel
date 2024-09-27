package br.com.hotel.quartos;

public class QuartoSimples extends Quarto {
	
	public QuartoSimples() {
		super(100.0, "Quarto Simples"); //Definindo o número por noite paraum quarto simples
	}

	//Polimorfismo
	@Override
	public double calcularPreco(int numeroNoites, boolean cafeManha, boolean spa) {
		// TODO Auto-generated method stub
		double total = precoNoite * numeroNoites; 
		
		if(cafeManha) {
			total += 20 * numeroNoites; //Custo do cafézinho da manhã
		}
		
		return total; //Quartos simples (for pobres) não tem permissão para usar o spa
	}

}