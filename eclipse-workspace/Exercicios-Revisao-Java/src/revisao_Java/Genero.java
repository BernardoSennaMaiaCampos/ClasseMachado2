package revisao_Java;
import java.util.Scanner;

public class Genero {

	private char letra;

    
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
                break;
            case 'M':
                System.out.println("M - Masculino");
                break;
            case 'N':
                System.out.println("N - Neutro");
                break;
            case 'X':
                System.out.println("Saindo do programa.");
                break;
            default:
                System.out.println("Gênero Inválido");
                break;
        }
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

        scanner.close();
    }

	public void exibirContadores() {
		
		
	}

}
