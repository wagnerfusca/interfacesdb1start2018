package br.com.db1.start.esporte;

public class Volei extends Esporte implements RegrasEsporte{

	@Override
	public void tempoJogo() {
		setTempoJogo(10000);
		
	}

}
