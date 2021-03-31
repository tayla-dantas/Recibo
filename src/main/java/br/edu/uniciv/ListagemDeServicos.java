package main.java.br.edu.uniciv;

import lombok.Data;

import java.util.List;

@Data
public class ListagemDeServicos {
    private List<String> listaDeServicos;

    public void addListaServico(String parametro){
        listaDeServicos.add(parametro);
    }
}
