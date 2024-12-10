package revisao_Java;
import java.util.Scanner;

public class Saudacao_Gentil {
    private String nome;
    private String turno;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    
    public void exibirMensagem() {
        switch (turno.toUpperCase()) {
            case "M":
                System.out.println("Bom Dia, " + nome + "!");
                break;
            case "V":
                System.out.println("Boa Tarde, " + nome + "!");
                break;
            case "N":
                System.out.println("Boa Noite, " + nome + "!");
                break;
            default:
                System.out.println("Valor Inválido!");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Saudacao_Gentil estudante = new Saudacao_Gentil();

        
        System.out.print("Digite seu nome: ");
        estudante.setNome(scanner.nextLine());

        
        System.out.print("Digite seu turno (M-matutino, V-vespertino, N-noturno): ");
        estudante.setTurno(scanner.nextLine());

        
        estudante.exibirMensagem();

        scanner.close();
    }
}
