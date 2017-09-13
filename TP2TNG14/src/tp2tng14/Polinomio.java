package tp2tng14;

import tp2tng14.ElevadoALaCeroException;

public class Polinomio {

	private int grado;
	private double [] coeficientes;
	// La posicion 0 del arreglo de coeficientes contiene el coeficiente de grado n y la posicion n contiene al termino independiente.

	
	public Polinomio(int grado){
		this.grado = grado;
		coeficientes = new double [grado];
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


	double evaluarMSucesivas (double x) throws ElevadoALaCeroException{
		double resultado=0;
		Polinomio pol = new Polinomio(getGrado());
		for (int i=1 ; i <= grado ; i++)
		{
			resultado+= potenciaPorMSucesivas(pol.coeficientes[i]*x,(grado-i+1));
		}
		return resultado;
	}

	double potenciaPorMSucesivas(double base, double exp) throws ElevadoALaCeroException {
	    double resultado=1;
	    if(base==0 && exp==0)
	    	throw new ElevadoALaCeroException("ERROR: 0 a la 0");
	    if(base!=0)
	    {
	        for(int i=0 ; i < exp ; i++)
	        	resultado*=base;
	        return resultado;
	    }
	    return 0;
	}
	
	double  evaluarRecursiva (double x){
		return x;
	}
	
	double evaluarRecursivaPar (double x){
		return x;
	}
	
	double evaluarProgDinamica (double x){
		return x;
	}
	
	double evaluarMejorada (double x){
		return x;
	}
	
	double evaluarPow(double x){
		return x;
	}
	
	double evaluarHorner (double x){
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
