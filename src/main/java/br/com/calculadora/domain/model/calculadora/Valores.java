package br.com.calculadora.domain.model.calculadora;

import lombok.Getter;

@Getter
public class Valores {

    private int valor1;
    private int valor2;
    private int resultado;

    public Valores(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
