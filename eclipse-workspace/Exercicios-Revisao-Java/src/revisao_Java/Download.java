package revisao_Java;
import java.util.Scanner;


public class Download {
	private double tamanhoArquivo; 
    private double velocidadeLink;  

    
    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    
    public double getVelocidadeLink() {
        return velocidadeLink;
    }

    public void setVelocidadeLink(double velocidadeLink) {
        this.velocidadeLink = velocidadeLink;
    }

    
    public double calcularTempoDownload() {
        double tamanhoEmBits = tamanhoArquivo * 8; 
        return tamanhoEmBits / velocidadeLink;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Download download = new Download();

        
        System.out.print("Digite o tamanho do arquivo (em MB): ");
        double tamanho = scanner.nextDouble();
        download.setTamanhoArquivo(tamanho);

        
        System.out.print("Digite a velocidade do link (em Mbps): ");
        double velocidade = scanner.nextDouble();
        download.setVelocidadeLink(velocidade);

        
        double tempo = download.calcularTempoDownload();
        System.out.println("Para realizar o download de um arquivo de " + tamanho + "MB em um link de " + velocidade + "Mbps, são necessários aproximadamente " + tempo + " segundos.");

        scanner.close();
    }
}
