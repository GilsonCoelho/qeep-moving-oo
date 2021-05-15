package br.com.qm.oo.televisao;

public class ControleRemoto {

	private Televisao televisao;
	private int volumeMax;
	private int volumeMIn;
	private int canalMAx;
	private int canalMin;
		
	public ControleRemoto(int volumeMax, int volumeMIn, int canalMAx, int canalMin) {
		this.televisao = new Televisao(0, 0);
		this.volumeMax = volumeMax;
		this.volumeMIn = volumeMIn;
		this.canalMAx = canalMAx;
		this.canalMin = canalMin;
	}
	public void aumentaVolume() {
		int volumeAtual = this.televisao.getVolumeAtual();
		if(televisao.getVolumeAtual()< this.volumeMax) {
			televisao.setVolumeAtual(volumeAtual + 1);
		}
	}
	public void diminuiVolume() {
		int volumeAtual = this.televisao.getVolumeAtual();
		if(televisao.getVolumeAtual()> this.volumeMIn) {
			televisao.setVolumeAtual(volumeAtual - 1);
		}
	}
	public void proximoCanal() {
		int canalAtual = this.televisao.getCanalAtual();
		if (canalAtual < this.canalMAx) {
			this.televisao.setCanalAtual(canalAtual + 1);
		}
	}
	public void voltaCanal() {
		int canalAtual = this.televisao.getCanalAtual();
		if (canalAtual > this.canalMin) {
			this.televisao.setCanalAtual(canalAtual - 1);
		}
	}
	public void trocaCanal(int novoCanal) {
		if(novoCanal >= this.canalMin && novoCanal <= this.canalMAx) {
			this.televisao.setCanalAtual(novoCanal);
		}
	}
	public void consultaTv() {
		System.out.println("-------------");
		System.out.printf(" /nCanal atual: %d \n", this.televisao.getCanalAtual());
		System.out.printf(" /nCanal atual: %d \n", this.televisao.getVolumeAtual());
		System.out.println("-------------");
		
		
	}
}
