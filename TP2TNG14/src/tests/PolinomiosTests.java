package tests;

import org.junit.Test;

import java.io.FileNotFoundException;

import org.junit.Assert;

import tp2tng14.ElevadoALaCeroException;
import tp2tng14.Polinomio;

public class PolinomiosTests {

	@Test
	public void test() throws ElevadoALaCeroException, FileNotFoundException {
		
		Polinomio pol = new Polinomio ("Entrada/Polinomio.txt");
		long startTime = System.nanoTime();
		Assert.assertEquals(9, pol.evaluarMejorada(1), 0.01);
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime);

	}
	

}
