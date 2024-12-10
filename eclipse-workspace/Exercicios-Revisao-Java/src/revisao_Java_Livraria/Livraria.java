package revisao_Java_Livraria;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livraria {
    private List<Livro> livrosDisponiveis;
    private List<Integer> quantidadeDisponivel;

    public Livraria() {
        livrosDisponiveis = new ArrayList<>();
        quantidadeDisponivel = new ArrayList<>();
    }

    
    public void cadastrarLivro(Livro livro, int quantidade) {
        livrosDisponiveis.add(livro);
        quantidadeDisponivel.add(quantidade);
        System.out.println("Livro cadastrado: " + livro.getTitulo() + " - Quantidade: " + quantidade);
    }

    
    public void venderLivro(String isbn) {
        for (int i = 0; i < livrosDisponiveis.size(); i++) {
            Livro livro = livrosDisponiveis.get(i);
            if (livro.getIsbn().equals(isbn)) {
                int quantidade = quantidadeDisponivel.get(i);
                if (quantidade > 0) {
                    quantidadeDisponivel.set(i, quantidade - 1);
                    System.out.println("Venda realizada: " + livro.getTitulo());
                    return;
                } else {
                    System.out.println("Livro esgotado: " + livro.getTitulo());
                    return;
                }
            }
        }
        System.out.println("Livro não encontrado com ISBN: " + isbn);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livraria livraria = new Livraria();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Vender Livro");
            System.out.println("0 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            if (opcao == 0) {
                break;
            }

            switch (opcao) {
                case 1:
                    Livro livro = new Livro();
                    System.out.print("Título: ");
                    livro.setTitulo(scanner.nextLine());
                    System.out.print("Autores: ");
                    livro.setAutores(scanner.nextLine());
                    System.out.print("Editora: ");
                    livro.setEditora(scanner.nextLine());
                    System.out.print("ISBN: ");
                    livro.setIsbn(scanner.nextLine());
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine(); 
                    livraria.cadastrarLivro(livro, quantidade);
                    break;

                case 2:
                    System.out.print("Digite o ISBN do livro a ser vendido: ");
                    String isbnVenda = scanner.nextLine();
                    livraria.venderLivro(isbnVenda);
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}


