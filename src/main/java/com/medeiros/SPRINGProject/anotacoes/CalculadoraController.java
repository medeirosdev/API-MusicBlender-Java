package com.medeiros.SPRINGProject.anotacoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalculadoraController {
    @GetMapping(path="/somar/{a}/{b}")
    public int Somar(@PathVariable int a, @PathVariable int b)
    {
        //http://localhost:8080/calc/somar/4/43 para usar a calc de somar
        return a + b;
    }
    @GetMapping("/subtrair")
    public int subtrair(
            @RequestParam(name = "a") int a,
            @RequestParam(name = "b") int b){
        return a-b;
    }
    //http://localhost:8080/calc/subtrair?a=4&b=3 -> para acessar a calculadora pelo http
}
