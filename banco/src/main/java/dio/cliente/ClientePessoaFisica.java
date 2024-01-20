package dio.cliente;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ClientePessoaFisica extends AbstractCliente implements Cliente {
    public ClientePessoaFisica(String nome) {
        super(nome);
    }
}
