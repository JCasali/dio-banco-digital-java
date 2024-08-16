public class Main {
   
    public static void main(String[] args) {
        Cliente thiago = new Cliente("Thiago");
        
        Conta contaCorrente = new ContaCorrente(thiago);
        Conta contaPoupanca = new ContaPoupanca(thiago);
        
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        contaCorrente.depositar(250);
        contaPoupanca.transferir(50, contaCorrente);
        contaCorrente.sacar(300);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}