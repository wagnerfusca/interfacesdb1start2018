package br.com.db1.start.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.calculadora.Divisao;
import br.com.db1.start.calculadora.Multiplica;
import br.com.db1.start.calculadora.OperacaoMatematica;
import br.com.db1.start.calculadora.Soma;
import br.com.db1.start.calculadora.Subtracao;

public class OperadoresTest {

	@Test
	public void calcularTest() {
		OperacaoMatematica operacao = new Soma();
		Assert.assertTrue(32 == operacao.calcula(30d, 2d));
		
		operacao = new Subtracao();
		Assert.assertTrue(28 == operacao.calcula(30d, 2d));
	
		operacao = new Multiplica();
		Assert.assertTrue(60 == operacao.calcula(30d, 2d));

		operacao = new Divisao();
		Assert.assertTrue(15 == operacao.calcula(30d, 2d));

	}
	
	
	
	
	
	
	
}
