public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente usuario) {
        super(usuario);
    }
    
    //MÉTODO PARA IMPRIMIR O EXTRATO DA CONTA CORRENTE
    @Override
    public void imprimirExtrato() {
        System.out.println("\n---- Extrato_Conta_Corrente ----");
        imprimirInformacao();
    }
}