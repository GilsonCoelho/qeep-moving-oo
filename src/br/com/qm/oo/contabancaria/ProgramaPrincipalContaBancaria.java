package br.com.qm.contabancaria;

public class ProgramaPrincipalContaBancaria {

public static void main(String[] args) {

		
	ClaaseContaBancaria conta = new ClaaseContaBancaria(1, "Gilson Coelho");
		
		conta.extrato();
		
		conta.deposito(25000);
		
		conta.extrato();
		
		conta.saque(1001);
		
		conta.extrato();
		
		conta.saque(5000);
		
		conta.extrato();
		
		

	}

}
