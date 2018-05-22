package br.com.db1.start.esporte;

public class Futebol extends Esporte implements RegrasEsporte{

	@Override
	public void tempoJogo() {
		setTempoJogo(90);
		
	}

}
