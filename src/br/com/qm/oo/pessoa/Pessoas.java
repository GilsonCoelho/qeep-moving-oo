package br.com.qm.oo.pessoa;

public class Pessoas {
//3. Crie uma classe para representar uma pessoa, com os atributos privados de
//	nome, ano de nascimento e altura. Crie os m�todos p�blicos necess�rios para
//	sets e gets e tamb�m um m�todo para imprimir todos dados de uma pessoa.
//	Crie um m�todo para calcular a idade da pessoa.
	
	private String nome;
	private int anoNascimento;
	private float altura;
	
	public Pessoas(String nome, int anoNascimento, float altura) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.altura = altura;
	} 
	
	public int calculaIdade(int anoAtual) {
		int idade = anoAtual - this.anoNascimento;
		return idade;
	}
	
	public void imprimeDados() {
		System.out.println("----------------");
		System.out.printf("\nNome: %s\n",this.nome);
		System.out.printf("\nAno de Nascimento: %d\n",this.anoNascimento);
		System.out.printf("\nAltura: %.2f\n",this.altura);
		System.out.printf("\nIdade: %d\n",this.calculaIdade(2021));
		System.out.println("----------------");
		
	}
	
	public String getNome() {
		return this.nome;
	}
	public int getanoNascimento(int anoNascimento) {
		return anoNascimento;		
	}
	public float getAltura() {
		return this.altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}

	
	
}
