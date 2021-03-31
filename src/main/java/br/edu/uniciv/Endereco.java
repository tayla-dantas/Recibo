package main.java.br.edu.uniciv;

import lombok.Data;

@Data
public class Endereco {

    private  TipoLogradouro tipoLogradouro;

    private  String logradouro;

    private Integer numero;

    private String complemento;

    private String bairro;

    private Cidade cidade;

    public UF pegarEstadoDaCidade(){
        return cidade.getUf();
    }
}
