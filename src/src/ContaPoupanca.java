public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente usuario) {
        super(usuario);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n---- Extrato_Conta_Poupança ----");
        imprimirInformacao();
    }
}