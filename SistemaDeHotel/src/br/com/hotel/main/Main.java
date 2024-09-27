package br.com.hotel.main;

import br.com.hotel.quartos.*; //import do pacote "quartos"
import br.com.hotel.reservas.Reserva;
import java.util.Scanner; //import do java

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner objScan = new Scanner(System.in);
	
	System.out.println("Escolha o tipo de quarto:");
	System.out.println("1 - Quarto Simples");
	System.out.println("2 - Quarto Luxo");
	System.out.println("3 - Suite Presidencial");
	
	int escolha = objScan.nextInt();

	Quarto quartoEscolhido = null;
	
	switch (escolha) {
	case 1:
		quartoEscolhido = new QuartoSimples();
		break;
	case 2:
		quartoEscolhido = new QuartoLuxo();
		break;
	case 3:
		quartoEscolhido = new SuitePresidencial();
		break;
	default:
		System.out.println("Opção não encontrada.");
		System.exit(0);
	}
	
	//Perguntas de ação (Elas iniciam a interação)
	System.out.println("Número de Noites: ");
	int numeroNoites = objScan.nextInt();
	
	System.out.println("Incluir café da manhã? (1 - Sim | 2 - Não)");
	boolean cafeManha = objScan.nextInt() == 1;
	
	System.out.println("Incluir permissão de acesso para o spa? (1 - Sim | 2 - Não)");
	boolean spa = objScan.nextInt() == 1;
	
	//Criação da reserva do cliente/usuario
	Reserva objReserva = new Reserva(quartoEscolhido, numeroNoites, cafeManha, spa);
	objReserva.detalhes();
	
	objScan.close();
	
	}

}
