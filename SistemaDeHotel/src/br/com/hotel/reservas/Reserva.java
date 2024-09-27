package br.com.hotel.reservas;

import br.com.hotel.quartos.Quarto;

public class Reserva {

	//atributos (caracteristicas)
	private Quarto quarto;
	private int numeNoites;
	private boolean cafeManha;
	private boolean spa;
	
	//Construtor
	public Reserva(Quarto quarto, int numeNoites, boolean cafeManha, boolean spa) {
		super();
		this.quarto = quarto;
		this.numeNoites = numeNoites;
		this.cafeManha = cafeManha;
		this.spa = spa;
	}

	public double calcularTotal() {
		return quarto.calcularPreco(numeNoites, cafeManha, spa);
	}
	
	public void detalhes() {
		System.out.println("====== Reserva no "+quarto.getNome()+" ======");
		System.out.println("Número de noites: "+numeNoites);
		System.out.println("Café da manhã: "+(cafeManha ? "Sim" : "Não"));
		System.out.println("Acesso ao spa: "+(spa ? "Sim" : "Não"));
		System.out.println("Preço total: R$ "+calcularTotal());
	}
	
}