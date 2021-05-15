package br.com.qm.oo.pessoa;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Pessoas pessoas = new Pessoas("José", 1988, 1.57F);
		pessoas.imprimeDados();
		pessoas.setAltura(1.92F);
		pessoas.imprimeDados();
		System.out.printf("\nO %s mede %.2f e tem %d anos", pessoas.getNome(), pessoas.getAltura(), pessoas.calculaIdade(2021));
	
	}

}
