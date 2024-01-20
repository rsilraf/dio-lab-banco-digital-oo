package dio.conta;

import dio.cliente.Cliente;

public class ContaCorrente extends AbstractConta {

    public ContaCorrente(Cliente cliente, int agencia) {
        super(cliente, agencia);
        this.tipo = ContaTipos.CONTA_CORRENTE;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}
