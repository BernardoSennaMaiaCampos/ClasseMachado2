package revisao_Java;
import java.util.Scanner;


public class Genero_2 {

	private char letra;
    private int contadorFeminino = 0;
    private int contadorMasculino = 0;
    private int contadorNeutro = 0;
    private int contadorInvalido = 0;

    
    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    
    public void verificarGenero() {
        switch (letra) {
            case 'F':
                System.out.println("F - Feminino");
                contadorFeminino++;
                break;
            case 'M':
                System.out.println("M - Masculino");
                contadorMasculino++;
                break;
            case 'N':
                System.out.println("N - Neutro");
                contadorNeutro++;
                break;
            case 'X':
                System.out.println("Saindo do programa.");
                break;
            default:
                System.out.println("Gênero Inválido");
                contadorInvalido++;
                break;
        }
    }

    
    public void exibirContadores() {
        System.out.println("Total de Feminino: " + contadorFeminino);
        System.out.println("Total de Masculino: " + contadorMasculino);
        System.out.println("Total de Neutro: " + contadorNeutro);
        System.out.println("Total de Gêneros Inválidos: " + contadorInvalido);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Genero genero = new Genero();

        while (true) {
            System.out.print("Digite um caractere (F, M, N ou X para sair): ");
            char input = scanner.next().toUpperCase().charAt(0);
            genero.setLetra(input);

            if (input == 'X') {
                genero.verificarGenero();
                break;
            }

            genero.verificarGenero();
        }

        
        genero.exibirContadores();
        scanner.close();
    }

}
