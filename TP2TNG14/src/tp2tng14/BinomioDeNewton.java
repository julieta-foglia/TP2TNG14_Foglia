package tp2tng14;

public class BinomioDeNewton {
	private Polinomio binomio;
	private int expo;
	
	public BinomioDeNewton (){
		binomio = new Polinomio(1);
		expo = 1;
	}
	
	private double combinatoria(double n, double k) {
		if (k==n)
			return 1;
		if(n < k)
			return 0;
		if(n == k+1)
			return n;
		
		return combinatoria(k-1, n-1) + combinatoria(k, n-1);
	}
}
