package calculo;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Calculadora {

    private Scanner scanner = new Scanner(System.in);
    private String operador;
    private double numero1;
    private double numero2;

    
    public String getOperador() {
        return operador;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    
    public void setOperador(String operador) {
        this.operador = operador;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void calcular() throws InterruptedException {
        System.out.println("\n\nBem-vindo à calculadora, siga as instruções abaixo para começar a calcular.\n");

        System.out.print("\nEscolha o operador: \n\n Somar (+)\n Subtrair (-)\n Multiplicar (x)\n Dividir (/)\n Sair (s)\n\n");
        setOperador(scanner.nextLine());
        
        if (!getOperador().equals("+") && !getOperador().equals("-") && !getOperador().equals("x") && !getOperador().equals("/") && !getOperador().equals("s")) {  
            System.out.println("\nA Escolha " + "'" + getOperador() + "'" + " é inválida. Por favor, tente novamente.");
            TimeUnit.SECONDS.sleep(1);
            calcular();
        }
        if (getOperador().equals("s")) {
            System.out.println("\nVocê escolheu 's'. Você saiu da calculadora.");
            System.exit(0);
        }
        
        System.out.println("Você escolheu o operador: " + getOperador());

        System.out.print("\n\nDigite o primeiro número: ");
        setNumero1(scanner.nextDouble());
        System.out.println("Você digitou o número: " + getNumero1());

        System.out.print("\nDigite o segundo número: ");
        setNumero2(scanner.nextDouble());
        System.out.println("Você digitou o número: " + getNumero2());

        scanner.nextLine();

        double resultado = 0;

        switch (getOperador()) {
            case "+":
                resultado = somar(getNumero1(), getNumero2());
                break;
            case "-":
                resultado = subtrair(getNumero1(), getNumero2());
                break;
            case "x":
                resultado = multiplicar(getNumero1(), getNumero2());
                break;
            case "/":
                resultado = dividir(getNumero1(), getNumero2());
                break;
            default:
                System.out.println("\nO operador "+"'"+ getOperador() +"'"+ " é inválido.");
                calcular();
        }

        System.out.println("\nO resultado da operação é: " + resultado);
        continua();
    }

    public void continua() throws InterruptedException {
        System.out.print("\nDeseja continuar usando a calculadora?\n\n Sim (y)\n Não (n)\n\n");
        String escolha = scanner.nextLine();
        System.out.println("Você escolheu: " + escolha);

        switch (escolha) {
            case "y":
                calcular();
                break;
            case "n":
                System.out.println("\nA calculadora será desligada em:\n\n");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("\n5\n");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("\n4\n");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("\n3\n");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("\n2\n");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("\n1\n");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Calculadora desligada.");
                System.exit(0);
                break;
            default:
                System.out.println("\nEscolha inválida.");
                continua();
        }
    }

    public double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double dividir(double numero1, double numero2) throws InterruptedException {
        if (numero2 == 0) {
            System.out.println("\nNão pode dividir por 0, por favor, tente novamente.");
            TimeUnit.SECONDS.sleep(1);
            calcular();
        }
        return numero1 / numero2;
    }

    public static void main(String[] args) throws InterruptedException {
        Calculadora calc = new Calculadora();
        calc.calcular();
    }
}

