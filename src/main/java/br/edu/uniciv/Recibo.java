package main.java.br.edu.uniciv;

import lombok.Data;

@Data
public class Recibo {

    private Integer numero;

    private Double valor;

    private  Emitente emitente;

    private  Cliente cliente;

    public String retornarValorPorExtenso(Double valor){
        validarSeDivisivelPorMil(valor);
        validarSeDivisivelPorCem(valor);
        validarSeDivisivelPorDez(valor);

        return "fim";

    }

    private String validarSeDivisivelPorDez(Double valor) {
        if(valor % 10 == 0){
            return "valor divisivel por dez";
        }
        return null;
    }

    private String validarSeDivisivelPorCem(Double valor) {
        if (valor % 100 == 0){
            return "valor divisivel por cem";
        }
        return null;
    }

    private String validarSeDivisivelPorMil(Double valor) {
        if (valor % 1000 == 0) {
            return "valor divisivel por mil";
        }
        return null;
    }
}
