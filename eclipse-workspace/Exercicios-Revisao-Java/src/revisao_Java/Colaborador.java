package revisao_Java;
import java.util.Scanner;

public class Colaborador {
    private double salario;

    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public void calcularReajuste() {
        double percentualAumento;
        if (salario <= 280.00) {
            percentualAumento = 0.20; 
        } else if (salario > 280.00 && salario <= 700.00) {
            percentualAumento = 0.15; 
        } else if (salario > 700.00 && salario <= 1500.00) {
            percentualAumento = 0.10; 
        } else {
            percentualAumento = 0.05; 
        }

        double aumento = salario * percentualAumento;
        double novoSalario = salario + aumento;

        
        System.out.printf("Salário antes do reajuste: R$ %.2f%n", salario);
        System.out.printf("Percentual de aumento aplicado: %.0f%%%n", percentualAumento * 100);
        System.out.printf("Valor do aumento: R$ %.2f%n", aumento);
        System.out.printf("Novo salário após o aumento: R$ %.2f%n", novoSalario);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Colaborador colaborador = new Colaborador();

        System.out.print("Digite o salário do colaborador: R$ ");
        double salario = scanner.nextDouble();
        colaborador.setSalario(salario);

        colaborador.calcularReajuste();

        scanner.close();
    }
}

