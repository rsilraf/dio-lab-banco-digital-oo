package dio;

import dio.banco.Banco;
import dio.cliente.ClientePessoaFisica;
import dio.conta.Conta;
import dio.conta.ContaTipos;
import dio.cliente.AbstractCliente;

public class Main {

    public static void main(String[] args) {

        ClientePessoaFisica venilton = new ClientePessoaFisica("Venilton");

        Banco banco = new Banco("Banco DIO", 999, 1);

        Conta cc = banco.abrirConta(ContaTipos.CONTA_CORRENTE, venilton);
        Conta poupanca = banco.abrirConta(ContaTipos.CONTA_POUPANCA, venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.printf("\n\n");
        System.out.println(((AbstractCliente) cc.getCliente()).getNome());
        System.out.println(cc.getCliente().getNome());

        System.out.println("\n\nTirando vantagem do Lombok @ToString para um print mais amigavel do banco e contas");
        System.out.printf("------------------------------------------------------------------------------------\n\n");
        System.out.println(banco);

        System.out.printf("\n\n");
    }

}
