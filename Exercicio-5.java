public class ContaCorrente {
    
    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public ContaCorrente(int numeroConta, String nomeCorrentista) {
        this(numeroConta, nomeCorrentista, 0.0);
    }

    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldoInicial;
    }

    public void alterarNome(String novoNome) {
        if (novoNome != null && !novoNome.trim().isEmpty()) {
            this.nomeCorrentista = novoNome;
        }
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void saque(double valor) {
        if (valor > 0) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para o saque.");
            }
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    Override
    public String toString() {
        return "ContaCorrente{" +
                "numeroConta=" + numeroConta +
                ", nomeCorrentista='" + nomeCorrentista + '\'' +
                ", saldo=R$ " + saldo +
                '}';
    }
}