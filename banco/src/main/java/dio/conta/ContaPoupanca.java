package dio.conta;

import dio.cliente.Cliente;

public class ContaPoupanca extends AbstractConta {

    public ContaPoupanca(Cliente cliente, int agencia) {
        super(cliente, agencia);
        this.tipo = ContaTipos.CONTA_POUPANCA;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupaça ===");
        super.imprimirInfosComuns();
    }
}
