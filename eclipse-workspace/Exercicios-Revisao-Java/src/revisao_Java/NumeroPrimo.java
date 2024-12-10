package revisao_Java;
import java.util.Scanner;

public class NumeroPrimo {
    private int numero;

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    public boolean isPrimo() {
        if (numero <= 1) {
            return false; 
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumeroPrimo numeroPrimo = new NumeroPrimo();

        System.out.print("Digite um número inteiro: ");
        int entrada = scanner.nextInt();
        numeroPrimo.setNumero(entrada);

        if (numeroPrimo.isPrimo()) {
            System.out.println(entrada + " é um número primo.");
        } else {
            System.out.println(entrada + " não é um número primo.");
        }

        scanner.close();
    }
}

