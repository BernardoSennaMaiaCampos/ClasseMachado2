package revisao_Java;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas;
    private double[] notas;

    public Aluno() {
        disciplinas = new String[3];
        notas = new double[3];
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina(int index) {
        return disciplinas[index];
    }

    public void setDisciplina(int index, String disciplina) {
        this.disciplinas[index] = disciplina;
    }

    public double getNota(int index) {
        return notas[index];
    }

    public void setNota(int index, double nota) {
        this.notas[index] = nota;
    }

    
    public boolean isAprovado(int index) {
        return notas[index] >= 7.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        
        System.out.print("Nome do Aluno: ");
        aluno.setNome(scanner.nextLine());

        System.out.print("Matrícula: ");
        aluno.setMatricula(scanner.nextLine());

        System.out.print("Curso: ");
        aluno.setCurso(scanner.nextLine());

        for (int i = 0; i < 3; i++) {
            System.out.print("Nome da disciplina " + (i + 1) + ": ");
            aluno.setDisciplina(i, scanner.nextLine());

            System.out.print("Nota da disciplina " + (i + 1) + ": ");
            aluno.setNota(i, scanner.nextDouble());
            scanner.nextLine(); 
        }

       
        System.out.println("\nResultado do Aluno " + aluno.getNome() + ":");
        for (int i = 0; i < 3; i++) {
            System.out.println("Disciplina: " + aluno.getDisciplina(i) + ", Nota: " + aluno.getNota(i) +
                    ", Aprovado: " + (aluno.isAprovado(i) ? "Sim" : "Não"));
        }

        scanner.close();
    }
}

