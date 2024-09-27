package br.com.hotel.quartos;

public abstract class Quarto {

	//Atributos (caracteristicas)
		protected double precoNoite;
		protected String nome;
		
		//Construtor
		public Quarto(double precoNoite, String nome) {
			super();
			this.precoNoite = precoNoite;
			this.nome = nome;
		}

		//Getters e Setters (Encapsulamento)
		public double getPrecoNoite() {
			return precoNoite;
		}

		public void setPrecoNoite(double precoNoite) {
			this.precoNoite = precoNoite;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public abstract double calcularPreco(int numeroNoites, boolean cafeManha, boolean spa);
	
}