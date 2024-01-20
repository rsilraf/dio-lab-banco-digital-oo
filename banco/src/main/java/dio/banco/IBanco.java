package dio.banco;

import dio.cliente.Cliente;
import dio.conta.ContaTipos;
import dio.conta.Conta;

public interface IBanco {
    Conta abrirConta(ContaTipos tipo, Cliente cliente);
}
