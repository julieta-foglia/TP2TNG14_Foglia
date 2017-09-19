package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import tp2tng14.BinomioDeNewton;
import tp2tng14.ElevadoALaCeroException;

public class BinomiosTests {
	
	String path = "Entrada/Binomio.in";
	String pathSalida = "Salidas/Binomio.out";
	double [] resEsperado;
	
//	@Before
//	public void setUpResultado() throws FileNotFoundException {
//		Scanner sc = new Scanner(new File (path));
//		double expo = sc.nextInt() + 1;
//		resEsperado = new double[(int) expo];
//		sc.close();
//		
//		Scanner scan = new Scanner(new File (pathSalida));
//		for(int i=0; i<expo; i++) {
//			resEsperado[i] = scan.nextInt();
//		}
//		scan.close();
//	}

	@Test
	public void testEvaluarMejorada() throws ElevadoALaCeroException, FileNotFoundException {
		
		BinomioDeNewton binomio = new BinomioDeNewton (path);
		long startTime = System.nanoTime();
		binomio.calcular();
		long endTime = System.nanoTime();
		System.out.println("Calcular: " + (endTime - startTime));
		
//		for(int i=0; i < binomio.getExpo()+1; i++) {
//			Assert.assertEquals(resEsperado[i], binomio.getRes()[i], 0.01);
//		}
		
	}

}
