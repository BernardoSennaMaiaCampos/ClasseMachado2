package revisao_Java;

public class Lampada {
    private String tipo; 
    private String cor;  
    private double preco; 
    private int voltagem; 
    private int garantia; 
    private boolean ligada; 

    
    public Lampada(String tipo, String cor, double preco, int voltagem, int garantia) {
        this.tipo = tipo;
        this.cor = cor;
        this.preco = preco;
        this.voltagem = voltagem;
        this.garantia = garantia;
        this.ligada = false; 
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public boolean isLigada() {
        return ligada;
    }

    
    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada já está ligada.");
        }
    }

    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("A lâmpada está desligada.");
        } else {
            System.out.println("A lâmpada já está desligada.");
        }
    }

    public static void main(String[] args) {
        
        Lampada lampada = new Lampada("led", "branca", 25.99, 110, 12);

       
        lampada.ligar();
        lampada.desligar();
        lampada.desligar(); 
        lampada.ligar(); 
    }
}

