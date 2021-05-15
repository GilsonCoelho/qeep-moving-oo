package br.com.qm.oo.televisao;

public class Televisao {

	
	private int canalAtual;
	private int volumeAtual;
	
	public Televisao(int canalAtual, int volumeAtual) {
		this.canalAtual = canalAtual;
		this.volumeAtual = volumeAtual;
	}

	public int getCanalAtual() {
		return canalAtual;
	}

	public void setCanalAtual(int canalAtual) {
		this.canalAtual = canalAtual;
	}

	public int getVolumeAtual() {
		return volumeAtual;
	}

	public void setVolumeAtual(int volumeAtual) {
		this.volumeAtual = volumeAtual;
	}
	
}
