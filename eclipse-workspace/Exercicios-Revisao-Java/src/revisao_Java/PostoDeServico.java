package revisao_Java;
import java.util.Scanner;

public class PostoDeServico {
    private double precoAlcool = 4.90; 
    private double precoGasolina = 5.50; 

   
    public double getPrecoAlcool() {
        return precoAlcool;
    }

    public double getPrecoGasolina() {
        return precoGasolina;
    }

    
    public double calcularValor(double litros, char tipo) {
        double precoPorLitro;
        double desconto = 0;

        if (tipo == 'A') {
            precoPorLitro = precoAlcool;
            
            if (litros > 20) {
                desconto = 0.05; 
            } else {
                desconto = 0.03; 
            }
        } else if (tipo == 'G') {
            precoPorLitro = precoGasolina;
            
            if (litros > 20) {
                desconto = 0.06; 
            } else {
                desconto = 0.04; 
            }
        } else {
            throw new IllegalArgumentException("Tipo de combustível inválido.");
        }

        double valorTotal = litros * precoPorLitro;
        double valorComDesconto = valorTotal * (1 - desconto);
        return valorComDesconto;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PostoDeServico posto = new PostoDeServico();

        System.out.print("Digite o número de litros vendidos: ");
        double litros = scanner.nextDouble();

        System.out.print("Digite o tipo de combustível (A - Álcool, G - Gasolina): ");
        char tipo = scanner.next().toUpperCase().charAt(0);

        double valorAPagar = posto.calcularValor(litros, tipo);

        System.out.printf("O valor a ser pago pelo cliente é: R$ %.2f%n", valorAPagar);

        scanner.close();
    }
}

