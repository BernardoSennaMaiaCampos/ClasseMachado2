package revisao_Java;
import java.util.Scanner;

public class Fibonacci {
    private int n; 

    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    
    public void gerarFibonacci() {
        if (n <= 0) {
            System.out.println("Por favor, insira um número maior que zero.");
            return;
        }

        int[] fibonacci = new int[n];
        fibonacci[0] = 1; 
        if (n > 1) {
            fibonacci[1] = 1; 
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; 
        }

        
        System.out.print("Série de Fibonacci até o " + n + "º termo: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + (i < n - 1 ? ", " : ""));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();

        System.out.print("Digite o número de termos da série de Fibonacci que deseja gerar: ");
        int termos = scanner.nextInt();
        fibonacci.setN(termos);

        fibonacci.gerarFibonacci();

        scanner.close();
    }
}

