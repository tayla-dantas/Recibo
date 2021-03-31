package main.java.br.edu.uniciv;

import lombok.Data;

@Data
public class Cliente {

    private String nome;

    private Endereco endereco;

    public void pegarUfdaCidade(){
        endereco.pegarEstadoDaCidade();
    }

}
