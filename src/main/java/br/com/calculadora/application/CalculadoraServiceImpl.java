package br.com.calculadora.application;

import br.com.calculadora.domain.model.calculadora.Valores;

class CalculadoraServiceImpl implements CalculadoraService {

    @Override
    public Valores soma(Valores valores) {
        valores.setResultado(valores.getValor1() + valores.getValor2());
        return valores;
    }

    @Override
    public Valores subtrai(Valores valores) {
        valores.setResultado(valores.getValor1() - valores.getValor2());
        return valores;
    }

    @Override
    public Valores multiplica(Valores valores) {
        valores.setResultado(valores.getValor1() * valores.getValor2());
        return valores;
    }

    @Override
    public Valores dividi(Valores valores) {
        valores.setResultado(valores.getValor1() / valores.getValor2());
        return valores;
    }
}
