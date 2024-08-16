public abstract class Conta implements IConta {
    protected static final int AGENCIA_PADRAO = 1;    
    protected static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente usuario;

    public Conta(Cliente usuario) {
        this.usuario = usuario;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }
    
    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }
        
    //1. MÉTODO SACAR
    @Override
    public void sacar(double valor) {
        if (valor == 0) {
            System.out.println("Erro: Valor inválido. Insira outro valor!");
            return;
        }
        if(valor > saldo){
            System.out.println("Saldo insuficiente. Insira outro valor.");
        }
        else if(valor<=saldo){
            saldo = saldo - valor;
            System.out.println("Aguarde um momento, seu dinheiro será entregue!");
        }
    }
    
    //2. MÉTODO DEPOSITAR
    @Override
    public void depositar(double valor) {
        if (valor == 0) {
            System.out.println("Erro: Valor inválido. Insira outro valor!");
            return;
        }
        saldo += valor;     //saldo = saldo + valor;
        System.out.println("Depósito realizado com sucesso. Seu saldo agora é de: " + saldo);
    }

    //3. MÉTODO TRANSFERIR
    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor == 0) {
            System.out.println("Erro: Valor inválido. Insira outro valor!");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente. Insira outro valor.");
            return;
        }
        if (valor <= saldo) {
        this.saldo -= valor;    //saldo = saldo - valor;
        contaDestino.depositar(valor);
        System.out.println("Transferência realizada com sucesso. Seu saldo agora é de " + saldo);
        }
    }
    //4. MÉTODO PARA IMPRIMIR INFORMAÇÕES DA CONTA
    protected void imprimirInformacao() {
        System.out.printf("Titular: %s%n", this.usuario.getNome());
        System.out.printf("Agência: %d%n", this.agencia);
        System.out.printf("Conta: %d%n", this.conta);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }
}