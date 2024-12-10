package revisao_Java;
import java.util.Scanner;

public class Loja {
    private double area;
    private static final double COBERTURA_POR_LITRO = 3.0; 
    private static final double LITROS_POR_LATÃO = 18.0; 
    private static final double PRECO_LATÃO = 80.0; 

    
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    
    public double calcularLitrosNecessarios() {
        return area / COBERTURA_POR_LITRO;
    }

    
    public int calcularLatõesNecessarios() {
        double litrosNecessarios = calcularLitrosNecessarios();
        return (int) Math.ceil(litrosNecessarios / LITROS_POR_LATÃO);
    }

    
    public double calcularCustoTotal() {
        int latõesNecessarios = calcularLatõesNecessarios();
        return latõesNecessarios * PRECO_LATÃO;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = new Loja();

        System.out.print("Digite o tamanho da área a ser pintada em metros quadrados: ");
        double area = scanner.nextDouble();
        loja.setArea(area);

        double litrosNecessarios = loja.calcularLitrosNecessarios();
        int latõesNecessarios = loja.calcularLatõesNecessarios();
        double custoTotal = loja.calcularCustoTotal();

        System.out.printf("Para uma área de %.2f m², você precisará de %.2f litros de tinta.\n", area, litrosNecessarios);
        System.out.printf("Você precisará de %d latões de tinta.\n", latõesNecessarios);
        System.out.printf("O custo total será de R$ %.2f.\n", custoTotal);

        scanner.close();
    }
}

