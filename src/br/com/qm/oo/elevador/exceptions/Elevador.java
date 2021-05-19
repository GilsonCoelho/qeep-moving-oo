package br.com.qm.oo.elevador.exceptions;

public class Elevador {
	
	//3. Crie uma classe denominada Elevador para armazenar as informa��es
	//  de um elevador dentro de um pr�dio. A classe deve armazenar o 
	//  andar atual (t�rreo = 0), total de andares no pr�dio 
	//  (desconsiderando o t�rreo), capacidade do elevador e quantas pessoas est�o presentes nele.
	//  A classe deve tamb�m disponibilizar os seguintes m�todos:
	//	Entra : para acrescentar uma pessoa no elevador (s� deve acrescentar se ainda houver espa�o);
	//	Sai : para remover uma pessoa do elevador (s� deve remover se houver algu�m dentro dele);
	//	Sobe : para subir um andar (n�o deve subir se j� estiver no �ltimo andar);
	//	Desce : para descer um andar (n�o deve descer se j� estiver no t�rreo);
	//	Crie um programa principal capaz de interagir com seu Elevador.
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int qtdPessoas;
	
	
	public Elevador(int totalAndares, int capacidade) {
		this.andarAtual = 0;
		this.qtdPessoas = 0;
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
	}
	
	public void entra() {
		
		if (qtdPessoas < capacidade) {
			qtdPessoas++;
			return;
		}
		
		throw new CargaElevadorException("O elevador est� cheio!");
	}
	
	public void sai() throws CargaElevadorException {
		if (qtdPessoas > 0) {
			qtdPessoas--;
		}
		
		throw new CargaElevadorException("O elevador j� est� vazio");
	}
	
	public void sobe() {
		if (andarAtual < totalAndares) {
			andarAtual++;
		}
	}
	
	public void desce() {
		if (andarAtual > 0) {
			andarAtual--;
		}
	}
	
	public void status() {
		System.out.println("----------");
		System.out.printf("\nO elevador est� no andar: %d\n", this.andarAtual);
		System.out.printf("\n H� %d pessoas no elevador.\n", this.qtdPessoas);
		System.out.println("----------");
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}
	
	

}