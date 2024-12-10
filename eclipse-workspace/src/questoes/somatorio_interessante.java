package questoes;

import java.util.Scanner;

public class somatorio_interessante {
	private int N;
	private double S;
	
	public int getN() {
		return N;
	}
	
	public void setN(int N) {
		this.N = N;
	}
	
	public double getS() {
		return S;
	}
	
	public void setS(double S) {
		this.S = S;
	}
	
	public void somatorio(){
		
		double S = 0;
		for (int i = 0; i < n; i++) {
			S += (1.0 / (i + 1)) * Math.pow(-1, i);
		}
		
		setResultado(S);
	}
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int S = scanner.nextInt();
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
