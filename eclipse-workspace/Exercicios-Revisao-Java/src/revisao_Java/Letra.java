package revisao_Java;
import java.util.Scanner;

public class Letra {
	 private char letra;

	    
	    public char getLetra() {
	        return letra;
	    }

	    public void setLetra(char letra) {
	        this.letra = letra;
	    }

	    
	    public void verificarLetra() {
	        letra = Character.toLowerCase(letra); 

	        if (letra >= 'a' && letra <= 'z') { 
	            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
	                System.out.println(letra + " é uma vogal.");
	            } else {
	                System.out.println(letra + " é uma consoante.");
	            }
	        } else {
	            System.out.println("Entrada inválida! Por favor, digite uma letra do alfabeto.");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Letra letra = new Letra();

	        System.out.print("Digite uma letra: ");
	        char input = scanner.next().charAt(0);
	        letra.setLetra(input);

	        letra.verificarLetra();

	        scanner.close();
	    }
}
