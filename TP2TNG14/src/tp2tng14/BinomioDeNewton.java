package tp2tng14;

public class BinomioDeNewton {
	private Polinomio binomio;
	private int expo;
	private double[] res;
	
	public BinomioDeNewton (){
		binomio = new Polinomio(1);
		expo = 2;
		res = new double[expo+1];
	}
	
	public void calcular(){	
		for(int k = this.expo; k >= 0 ; k-- ){
			res[expo - k] = combinatoria(k,this.expo)*Math.pow(binomio.getCoeficientes()[0], k)*Math.pow(binomio.getCoeficientes()[1], k-this.expo);
		}
	}	
	
	private double combinatoria(double k, double n) {
		if (n==k)
			return 1;
		if(k < n)
			return 0;
		if(k == n+1)
			return k;
		return combinatoria(n-1, k-1) + combinatoria(n, k-1);
	}
}
