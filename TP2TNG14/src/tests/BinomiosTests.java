package tests;

import org.junit.Test;

import java.io.FileNotFoundException;

import org.junit.Assert;

import tp2tng14.BinomioDeNewton;
import tp2tng14.ElevadoALaCeroException;
import tp2tng14.Polinomio;

public class BinomiosTests {
	
	String path = "Entrada/Binomio.txt";
	double resultado = 351;

	@Test
	public void testEvaluarMejorada() throws ElevadoALaCeroException, FileNotFoundException {
		
		BinomioDeNewton binomio = new BinomioDeNewton (path);
		long startTime = System.nanoTime();
		//Assert.assertEquals(resultado, binomio.combinatoria(), 0.01);
		long endTime = System.nanoTime();
		System.out.println("Evaluar Mejorada: " + (endTime - startTime));

	}

}
