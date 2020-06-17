package br.com.calculadora.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class BeanConfiguration {

    @Bean
    public CalculadoraService calculadoraService(){
        return new CalculadoraServiceImpl();

    }
}
