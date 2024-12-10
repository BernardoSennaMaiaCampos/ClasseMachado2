package zooJava;

class Animal {
    private String nome;
    private int comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private float velocidade;

    public Animal(String nome, String cor, String ambiente, int comprimento, float velocidade, int patas) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.velocidade = velocidade;
        this.patas = patas;
    }

    
    public String getNome() {
        return nome;
    }

    public int getComprimento() {
        return comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public String getCor() {
        return cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public float getVelocidade() {
        return velocidade;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public void dados() {
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("Patas: " + patas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade: " + velocidade + " m/s");
    }
}

class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, String caracteristica, int comprimento, float velocidade) {
        super(nome, "Cinzento", "Mar", comprimento, velocidade, 0);
        this.caracteristica = caracteristica;
    }

    
    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Característica: " + caracteristica);
    }
}

class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, String cor, String alimento, int comprimento, float velocidade, int patas) {
        super(nome, cor, "Terra", comprimento, velocidade, patas);
        this.alimento = alimento;
    }

    
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Alimento: " + alimento);
    }
}

public class ZooClasses {
    public static void main(String[] args) {
        Animal camelo = new Animal("Camelo", "Amarelo", "Terra", 150, 2.0f, 4);
        camelo.dados();

        System.out.println("------------------------------");

        Peixe tubarao = new Peixe("Tubarão", "Barbatanas e cauda", 300, 1.5f);
        tubarao.dados();

        System.out.println("------------------------------");

        Mamifero urso = new Mamifero("Urso-do-canadá", "Vermelho", "Mel", 180, 0.5f, 4);
        urso.dados();
    }
}
