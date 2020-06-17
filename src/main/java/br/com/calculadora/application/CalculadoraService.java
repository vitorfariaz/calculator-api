package br.com.calculadora.application;

import br.com.calculadora.domain.model.calculadora.Valores;

public interface CalculadoraService {
    Valores soma(Valores valores);
    Valores subtrai(Valores valores);
    Valores multiplica(Valores valores);
    Valores dividi(Valores valores);

}
