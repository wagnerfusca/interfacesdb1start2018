package br.com.db1.start.calculadora;

public class Soma implements OperacaoMatematica{

	@Override
	public Double calcula(Double valor1, Double valor2) {
		return valor1 + valor2;
	}

}
