package dio.conta;

import dio.cliente.AbstractCliente;
import dio.cliente.Cliente;
import lombok.Getter;
import lombok.ToString;

@ToString
abstract class AbstractConta implements Conta {

    private static int SEQUENCIAL = 1;

    @Getter
    protected ContaTipos tipo;

    @Getter
    protected int agencia;
    @Getter
    protected int numero;
    @Getter
    protected double saldo;
    @Getter
    protected Cliente cliente;

    public AbstractConta(Cliente cliente, int agencia) {
        this.agencia = agencia;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
