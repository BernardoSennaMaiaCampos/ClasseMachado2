package revisao_Java;

public class ContaCorrente {
    private String numero;
    private double saldo;
    private boolean especial;
    private double limite;

    
    public ContaCorrente(String numero, boolean especial, double limite) {
        this.numero = numero;
        this.saldo = 0.0; 
        this.especial = especial;
        this.limite = limite;
    }

    
    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public double getLimite() {
        return limite;
    }

    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque deve ser positivo.");
            return;
        }
        
        if (valor > saldo + (especial ? limite : 0)) {
            System.out.println("Saque não realizado. Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
        }
    }

    
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    
    public void verificarChequeEspecial() {
        if (saldo < 0) {
            System.out.println("Você está usando cheque especial.");
        } else {
            System.out.println("Você não está usando cheque especial.");
        }
    }

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("12345-6", true, 500.0);
        
        conta.depositar(1000.0);
        conta.consultarSaldo();
        conta.sacar(1200.0);
        conta.verificarChequeEspecial();
        conta.consultarSaldo();
        conta.sacar(400.0);
        conta.verificarChequeEspecial();
        conta.consultarSaldo();
    }
}

