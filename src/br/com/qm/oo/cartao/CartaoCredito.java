package br.com.qm.oo.cartao;

public class CartaoCredito {
	float limite;
	float saldo;
	String nomeCliente;
	
	public CartaoCredito(float limite, String nomeCliente) {
		this.limite = limite;
		this.saldo = 0;
		this.nomeCliente = nomeCliente;
	}
	
	// Acrescentar valor ao limite atual
	
	public void aumentaLimite(float valorAcrescido) {
		
		if(valorAcrescido > 0) {
			this.limite +=valorAcrescido;
		}
	}
	
	public void diminuiLimite(float valorDecrescido) {
		
		if(valorDecrescido > 0 && valorDecrescido <= this.limite) {
			this.limite -= valorDecrescido;
		}
	}
	
	public void realizaCompra(float valorCompra) {
		
		float novoSaldo = saldo + valorCompra;
		
		if (novoSaldo <= limite) {
			
			this.saldo = novoSaldo;
		}
	}
	
	

	
}
