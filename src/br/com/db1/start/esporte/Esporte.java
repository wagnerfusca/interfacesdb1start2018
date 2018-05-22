package br.com.db1.start.esporte;

import java.util.logging.Logger;

public class Esporte {

	private Logger logger = Logger.getLogger("Esporte");
	
	private EsporteOlimpicoColetivo nomeEsporte;

	private Integer tempoJogo;

	public EsporteOlimpicoColetivo getNomeEsporte() {
		return nomeEsporte;
	}

	public void nomeErradoDeMetodo() {
		logger.info("Oi Brasil");
		
	}
	public void setNomeEsporte(EsporteOlimpicoColetivo nomeEsporte) {
		this.nomeEsporte = nomeEsporte;
	}

	public Integer getTempoJogo() {
		return tempoJogo;
	}

	public void setTempoJogo(Integer tempoJogo) {
		this.tempoJogo = tempoJogo;
	}

	public void retornarDadosDoEsporte() {
		getTempoJogo();
		
	}

}
