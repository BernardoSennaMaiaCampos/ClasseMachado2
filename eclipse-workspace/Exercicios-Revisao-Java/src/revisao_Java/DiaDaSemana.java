package revisao_Java;
import java.util.Scanner;

public class DiaDaSemana {
	private int dia;

    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    
    public void exibirDiaDaSemana() {
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DiaDaSemana diaDaSemana = new DiaDaSemana();

        while (true) {
            System.out.print("Digite um número de 1 a 7 para o dia da semana (ou 0 para sair): ");
            int input = scanner.nextInt();
            diaDaSemana.setDia(input);

            if (input == 0) {
                System.out.println("Saindo do programa.");
                break;
            }

            diaDaSemana.exibirDiaDaSemana();
        }

        scanner.close();
    }
}
