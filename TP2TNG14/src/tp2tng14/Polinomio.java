package tp2tng14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import tp2tng14.ElevadoALaCeroException;

public class Polinomio {

	private int grado;
	private double [] coeficientes;
	// La posicion 0 del arreglo de coeficientes contiene el coeficiente de grado n y la posicion n contiene al termino independiente.

	
	public Polinomio(int grado){
		this.grado = grado;
		coeficientes = new double [grado+1];
	}
	
	public Polinomio(String path) throws FileNotFoundException{
		Scanner sc = new Scanner (new File(path));
		this.grado = sc.nextInt();
		this.coeficientes = new double [this.grado+1];
		for (int i = 0 ; i <= this.grado;i++){
			this.coeficientes[i] = sc.nextInt();
		}
	}
	
	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public double[] getCoeficientes() {
		return coeficientes;
	}

	public void setCoeficientes(double[] coeficientes) {
		this.coeficientes = coeficientes;
	}


	public double evaluarMSucesivas (double x) throws ElevadoALaCeroException 
	{
		double resultado = 0;
		for (int i=0 ; i <= this.grado ; i++)
			resultado += this.coeficientes[i] * potenciaPorMSucesivas(x,(this.grado-i));
		return resultado;
	}

	public double potenciaPorMSucesivas(double base, double exp) throws ElevadoALaCeroException {
	    double resultado=1;
	    
	    if(base == 0 && exp == 0)
	    	throw new ElevadoALaCeroException("ERROR: 0 a la 0");
	    
	    if(base != 0)
	    {
	        for(int i = 0 ; i < exp ; i++)
	        	resultado *= base;
	        
	        return resultado;
	    }
	    return 0;
	}
	
	public double evaluarRecursiva (double x){
		double resultado = 0;
		for(int i = 0 ; this.grado >= i ; i++ ){
			resultado += this.coeficientes[i] * potencia(x,this.grado-i);
		}
		return resultado;
	}
	
	public double potencia(double base, double exp){
		if(exp == 0)
			return 1;
		return base * potencia(base,exp-1);
	}
	
	public double evaluarRecursivaPar (double x) throws ElevadoALaCeroException{
		double resultado = 0;
		for (int i = 0; i <= this.grado; i++)
		resultado += this.coeficientes[i] * potenciaRecPar(x, i);
		return resultado;
	}
	
	double potenciaRecPar(double base, int exp) throws ElevadoALaCeroException
	{
		double resultado;
		if(base == 0 && exp == 0)
	    	throw new ElevadoALaCeroException("ERROR: 0 a la 0");
		if (exp == 0)
			return 1.0;
		if (exp % 2 == 1)
			return base * potenciaRecPar(base, exp - 1);
		else 
		{
			resultado = potenciaRecPar(base, exp / 2);
			return resultado * resultado;
		}
	}

	public double evaluarProgDinamica (double x)
	{
		double resultado = 0;
		for (int i = this.grado; i >= 0; i--)
			resultado = resultado * x + this.coeficientes[i];
		return resultado;
	}
	
	public double evaluarMejorada (double x) {
		double aux = 1;
		double resultado= this.coeficientes[0];
		for (int i = 1; i < this.grado; i++) 
		{
			aux *= x;
			resultado += this.coeficientes[i] * aux;
		}
		return resultado;
	}
	
	public double evaluarPow(double x)
	{	
		double resultado = 0;
		for (int i=0 ; i <= this.grado ; i++)
			resultado += this.coeficientes[i] * Math.pow(x,(this.grado-i));
		
		return resultado;
	}
	
	public double evaluarHorner (double x) {
		 
		double resultado = 0;
	        
		 for (int i = this.getGrado(); i >= 0; i--)
	            resultado = this.coeficientes[i] + (x * resultado);
		 
	     return resultado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
