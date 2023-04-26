/*
package com.medeiros.SPRINGProject.anotacoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Use anottations para anotar métodos para determinadas rotas
// use: @
@RestController // Notação de Controller do Spring -> use isso para criar um controller
public class FirstController {
    // p Request mapping define os métodos e também pode definir a rota
    //é possível ter mais de uma URL para o mesmo método
    @RequestMapping(method = RequestMethod.GET , path = "/")
     public String HelloWorldSpring(){

        return "Olá HTML!";
     }
     //Ver a diferença em cada tipo de mapping diferente!
     @GetMapping(path = {"/meunumero" , "/mesmonumero"})
     public int SendMyNumber(){

        return 19292924-123123;
        //Se colocado desse modo, retorna um JSON
     }
     //o RequestMapping por padrão é usado com o método GET

}
*/