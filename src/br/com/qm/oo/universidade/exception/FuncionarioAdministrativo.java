package br.com.qm.oo.universidade.exception;

public class FuncionarioAdministrativo extends Funcionario {

	//Os funcion�rios administrativos possuem os atributos: 
	//Fun��o Administrativa e senioridade.
	private String funcaoAdministrativa;
	private String senioridade;
	
	public FuncionarioAdministrativo(String nome, String cpf, int nroRegistro, String orgaoLotacao, double salario,
			String funcaoAdministrativa, String senioridade) {
		super(nome, cpf, nroRegistro, orgaoLotacao, salario);
		this.funcaoAdministrativa = funcaoAdministrativa;
		this.senioridade = senioridade;
	}

	public String getFuncaoAdministrativa() {
		return funcaoAdministrativa;
	}

	public void setFuncaoAdministrativa(String funcaoAdministrativa) {
		this.funcaoAdministrativa = funcaoAdministrativa;
	}

	public String getSenioridade() {
		return senioridade;
	}

	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}
	
}