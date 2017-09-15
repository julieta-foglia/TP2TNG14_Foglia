package tests;

import org.junit.Test;

import java.io.FileNotFoundException;

import org.junit.Assert;

import tp2tng14.ElevadoALaCeroException;
import tp2tng14.Polinomio;

public class PolinomiosTests {

	@SuppressWarnings("deprecation")
	@Test
	public void test() throws ElevadoALaCeroException, FileNotFoundException {
		//Polinomio pol = new Polinomio(3);
		//double [] vec = new double[4];
			
		Polinomio pol = new Polinomio ("Entrada/Polinomio.txt");
		//pol.getCoeficientes()[0] = 5;
		//pol.getCoeficientes()[1] = 2;
		//pol.getCoeficientes()[2] = 1;
		//pol.getCoeficientes()[3] = 1;
	
		Assert.assertEquals(9, pol.evaluarProgDinamica(1), 0.01);
	}
	

}
