package br.com.qm.oo.televisao;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		ControleRemoto controle = new ControleRemoto(100, 0, 50, 0);
		
		controle.consultaTv();
		
		controle.aumentaVolume();
		controle.aumentaVolume();
		
		controle.consultaTv();
		
		controle.proximoCanal();
		controle.proximoCanal();
		controle.proximoCanal();
		
		controle.diminuiVolume();
		controle.voltaCanal();
		
		controle.consultaTv();
		
		controle.trocaCanal(24);
		controle.consultaTv();
		controle.trocaCanal(57);
		
		for (int i = 0; i< 100; i++) {
			controle.aumentaVolume();
		}
		
		controle.consultaTv();
	}

}
