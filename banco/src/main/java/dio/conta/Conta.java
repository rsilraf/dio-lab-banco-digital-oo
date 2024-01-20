package dio.conta;

import dio.cliente.Cliente;

public interface Conta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();

    Cliente getCliente();
}
