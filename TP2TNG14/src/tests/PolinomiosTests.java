package tests;

import org.junit.Test;

import org.junit.Assert;
import tp2tng14.Polinomio;

public class PolinomiosTests {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Polinomio pol = new Polinomio(3);
		double [] vec = new double[4];
				
		vec[0] = 5;
		vec[1] = 2;
		vec[2] = 1;
		vec[3] = 1;
				
		Assert.assertEquals(9, pol.evaluarRecursiva(1), 0.01);
	}

}
