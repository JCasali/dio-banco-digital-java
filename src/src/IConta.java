public interface IConta {
    
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino); /*Pode ser tamb�m: (double valor, IConta contaDestino) */

    void imprimirExtrato();
}