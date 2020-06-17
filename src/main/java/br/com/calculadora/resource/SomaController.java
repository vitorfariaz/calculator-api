package br.com.calculadora.resource;

import br.com.calculadora.application.CalculadoraService;
import br.com.calculadora.domain.model.calculadora.Valores;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
public class SomaController {

    private CalculadoraService service;

    public SomaController(@NotNull final CalculadoraService service) {
        this.service = service;
    }

    @PostMapping(value = "/somar")
    public ResponseEntity<Valores> soma(@RequestBody Valores valores) {
        Valores resultado = service.soma(valores);
        return new ResponseEntity<>(resultado, HttpStatus.CREATED);
    }

    @PostMapping(value = "/multiplicar")
    public ResponseEntity<Valores> multiplicar(@RequestBody Valores valores) {
        Valores resultado = service.multiplica(valores);
        return new ResponseEntity<>(resultado, HttpStatus.CREATED);
    }

    @PostMapping(value = "/subtrair")
    public ResponseEntity<Valores> subtrair(@RequestBody Valores valores) {
        Valores resultado = service.subtrai(valores);
        return new ResponseEntity<>(resultado, HttpStatus.CREATED);
    }

    @PostMapping(value = "/dividir")
    public ResponseEntity<Valores> dividir(@RequestBody Valores valores) {
        Valores resultado = service.dividi(valores);
        return new ResponseEntity<>(resultado, HttpStatus.CREATED);
    }





}
