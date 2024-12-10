package revisao_Java;

public class LetItBe {
    private String repeticao;
    private String resposta;
    private String sabedoria;

   
    public LetItBe() {
        this.repeticao = "let it be";
        this.resposta = "there will be an answer";
        this.sabedoria = "whisper words of wisdom, let it be";
    }

    
    public String getRepeticao() {
        return repeticao;
    }

    public String getResposta() {
        return resposta;
    }

    public String getSabedoria() {
        return sabedoria;
    }

    
    public void imprimirLetra() {
        for (int i = 0; i < 4; i++) {
            System.out.println(getRepeticao() + ",");
        }
        System.out.println(getResposta() + ",");
        for (int i = 0; i < 5; i++) {
            System.out.println(getRepeticao() + ",");
        }
        System.out.println(getSabedoria() + ".");
    }

    public static void main(String[] args) {
        LetItBe letra = new LetItBe();
        letra.imprimirLetra();
    }
}

