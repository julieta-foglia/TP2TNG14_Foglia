package tests;

import org.junit.Test;

import java.io.FileNotFoundException;

import org.junit.Assert;

import tp2tng14.ElevadoALaCeroException;
import tp2tng14.Polinomio;

public class PolinomiosTests {
	
	String path = "Entrada/Polinomio5.txt";
	double resultado = 351;

	@Test
	public void testEvaluarMejorada() throws ElevadoALaCeroException, FileNotFoundException {
		
		Polinomio pol = new Polinomio (path);
		long startTime = System.nanoTime();
		Assert.assertEquals(resultado, pol.evaluarMejorada(1), 0.01);
		long endTime = System.nanoTime();
		System.out.println("Evaluar Mejorada: " + (endTime - startTime));

	}
	
	@Test
	public void testEvaluarMSucesivas() throws ElevadoALaCeroException, FileNotFoundException {
		
		Polinomio pol = new Polinomio (path);
		long startTime = System.nanoTime();
		Assert.assertEquals(resultado, pol.evaluarMSucesivas(1), 0.01);
		long endTime = System.nanoTime();
		System.out.println("Evaluar M Sucesivas: " + (endTime - startTime));

	}
	
	@Test
	public void testEvaluarRecursiva() throws ElevadoALaCeroException, FileNotFoundException {
		
		Polinomio pol = new Polinomio (path);
		long startTime = System.nanoTime();
		Assert.assertEquals(resultado, pol.evaluarRecursiva(1), 0.01);
		long endTime = System.nanoTime();
		System.out.println("Evaluar Recursiva: " + (endTime - startTime));

	}
	
	@Test
	public void testEvaluarRecursivaPar() throws ElevadoALaCeroException, FileNotFoundException {
		
		Polinomio pol = new Polinomio (path);
		long startTime = System.nanoTime();
		Assert.assertEquals(resultado, pol.evaluarRecursivaPar(1), 0.01);
		long endTime = System.nanoTime();
		System.out.println("Evaluar Recursiva Par: " + (endTime - startTime));

	}
		
	@Test
	public void testEvaluarProgDinamica() throws ElevadoALaCeroException, FileNotFoundException {
		
		Polinomio pol = new Polinomio (path);
		long startTime = System.nanoTime();
		Assert.assertEquals(resultado, pol.evaluarProgDinamica(1), 0.01);
		long endTime = System.nanoTime();
		System.out.println("Evaluar Prog Dinamica: " + (endTime - startTime));

	}
	
	@Test
	public void testEvaluarHorner() throws ElevadoALaCeroException, FileNotFoundException {
		
		Polinomio pol = new Polinomio (path);
		long startTime = System.nanoTime();
		Assert.assertEquals(resultado, pol.evaluarHorner(1), 0.01);
		long endTime = System.nanoTime();
		System.out.println("Evaluar Horner: " + (endTime - startTime));

	}
	

}
