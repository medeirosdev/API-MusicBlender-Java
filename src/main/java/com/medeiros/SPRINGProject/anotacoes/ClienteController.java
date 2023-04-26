/*
package com.medeiros.SPRINGProject.anotacoes;

import models.Users;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class ClienteController {
    @GetMapping(path="/john")
    public Users obterUsers(){
        return new Users(34, "john", 19, "491842-2424");
    }

    public Users cliente = new Users(34, "john", 19, "491842-2424");
    @GetMapping("/{id}") // trabalha com variáveis na rota
    public Users ObterUserporId(@PathVariable int id){
        return new Users(id, "john", 19, "491842-2424");
    }

    //Como trabalhar com parâmetros nas rotas ->
    // Para trabalhar com segurança, vamos passar o parâmetro
    // na query
    // desse modo a rota ficará:
    ///users/?id="algo"
    @GetMapping
    public Users obterUserporIdSeguro(
            @RequestParam(name = "id") int id){
        return new Users(id, "john", 19, "491842-2424");
    }
    //É possível passar configurações para esse requestparam
    // como valor padrão, mais de um valor
}
*/