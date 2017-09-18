package tp2tng14;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		BinomioDeNewton binomio = new BinomioDeNewton("Entrada/Binomio.txt");		
		binomio.calcularP();
	}

}
