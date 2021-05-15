package br.com.qm.contabancaria;

public class ClaaseContaBancaria {

	// 2. Crie uma classe referente � uma conta banc�ria, que possui como atributos 
	// o seu n�mero, saldo e o nome do correntista. 
	// Crie tamb�m o m�todo saque() que serve para retirar um certo valor do saldo,
	// o m�todo dep�sito() que serve para adiconar um valor ao saldo e o m�todo extrato() 
	// que serve para mostrar na tela o nome do correntista, o n�mero da conta e o saldo. 
	// Crie um programa principal e demonstre a utiliza��o dos m�todos implementados.
	int nroConta;
	float saldo;
	String nomeCorrentista;
	
	public ClaaseContaBancaria(int nroConta, String nomeCorrentista) {
		this.nroConta = nroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = 0;
	}
	
	public boolean saque(float valor) {
		if (this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	public boolean deposito(float valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		}
		
		return false;
	}
	
	public void extrato() {
		System.out.println("\n----------EXTRATO--------\n");
		System.out.printf("\nNro da conta: %d", this.nroConta);
		System.out.printf("\nCorrentista: %s", this.nomeCorrentista);
		System.out.printf("\nSaldo: %.2f", this.saldo);
	}
	
	
	
}