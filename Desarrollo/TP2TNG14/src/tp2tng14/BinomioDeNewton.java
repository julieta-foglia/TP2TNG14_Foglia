package tp2tng14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinomioDeNewton {
	private Polinomio binomio;
	private int expo;
	private double[] res;
	
	public BinomioDeNewton (){
		binomio = new Polinomio(1);
		expo = 2;
		res = new double[expo+1];
	}
	
	public BinomioDeNewton(String path) throws FileNotFoundException{
		Scanner sc= new Scanner (new File(path));
		binomio = new Polinomio(1);
		expo = sc.nextInt();
		binomio.getCoeficientes()[0]=sc.nextInt();
		binomio.getCoeficientes()[1]=sc.nextInt();
		res = new double [expo + 1];
		sc.close();
	}
	
	public void calcular(){	
		for(int k = this.expo; k >= 0 ; k-- ){
			res[this.expo - k] = combinatoria(this.expo,k)*Math.pow(binomio.getCoeficientes()[0], k)*Math.pow(binomio.getCoeficientes()[1],this.expo-k);
		}
	}
	
	public void calcularProgDinamica(){
		double[][] mat = new double[this.expo+1][this.expo+1]; 
		for(int i =0 ; i <= this.expo;i++){
			for(int j = 0; j<=i; j++){
				if(i==j || j == 0){
					mat[i][j] = 1;
				}else{
					mat[i][j] = mat[i-1][j] + mat[i-1][j-1];
				}				
			}
		}
		for(int k = this.expo; k >= 0 ; k--){
			res[this.expo - k] = mat[this.expo][this.expo-k] *Math.pow(binomio.getCoeficientes()[0], k)*Math.pow(binomio.getCoeficientes()[1],this.expo-k);
		}
	}
	
	private double combinatoria(double n, double k) {
		if (k==0 || k==n)
			return 1;
		else
			return combinatoria(n-1, k-1) + combinatoria(n-1,k);
	}
	
	public double evaluarBinomio (double x)
	{
		double resultado = 0;
		for (int i = this.expo; i >= 0; i--)
			resultado = resultado * x + this.res[i];
		return resultado;
	}

	public double[] getRes() {
		return res;
	}

	public void setRes(double[] res) {
		this.res = res;
	}

	public Polinomio getBinomio() {
		return binomio;
	}

	public void setBinomio(Polinomio binomio) {
		this.binomio = binomio;
	}

	public int getExpo() {
		return expo;
	}

	public void setExpo(int expo) {
		this.expo = expo;
	}
}
