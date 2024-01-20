package dio.banco;

import java.util.ArrayList;
import java.util.List;

import dio.cliente.Cliente;
import dio.conta.Conta;
import dio.conta.ContaCorrente;
import dio.conta.ContaPoupanca;
import dio.conta.ContaTipos;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Banco implements IBanco {

    @Getter
    private String nome;

    @Getter
    private int codigo;

    @Getter
    @Setter
    private List<Conta> contas;

    @Getter
    @Setter
    private int agencia;

    public Banco(String nome, int codigo, int agencia) {
        this.nome = nome;
        this.codigo = codigo;
        this.agencia = agencia;
        this.contas = new ArrayList<>();
    }

    @Override
    // contas factory
    public Conta abrirConta(ContaTipos tipo, Cliente cliente) {
        Conta novaConta;
        switch (tipo) {
            case CONTA_POUPANCA:
                novaConta = new ContaPoupanca(cliente, this.agencia);
                break;
            case CONTA_CORRENTE:
                novaConta = new ContaCorrente(cliente, this.agencia);
                break;
            default:
                throw new IllegalArgumentException("Tipo de conta não reconhecido.");
        }
        contas.add(novaConta);
        return novaConta;
    }

}
