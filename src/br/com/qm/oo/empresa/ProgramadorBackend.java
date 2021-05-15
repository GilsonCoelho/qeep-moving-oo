package br.com.qm.oo.empresa;

public class ProgramadorBackend extends Programador {
	
	private String ServiceCloud;

	public ProgramadorBackend(String nome, String cpf, double salario, double horasSemanais, String linguagem,
			String projeto, String serviceCloud) {
		super(nome, cpf, salario, horasSemanais, linguagem, projeto);
		ServiceCloud = serviceCloud;
	}

	public String getServiceCloud() {
		return ServiceCloud;
	}

	public void setServiceCloud(String serviceCloud) {
		ServiceCloud = serviceCloud;
	}
	

}
