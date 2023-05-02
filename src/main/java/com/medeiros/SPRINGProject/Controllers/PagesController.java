package com.medeiros.SPRINGProject.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PagesController {

    @GetMapping("/pagina")
    public ModelAndView minhaPagina() {
        ModelAndView modelAndView = new ModelAndView("minhaPagina");
        modelAndView.addObject("titulo", "Minha Página");
        modelAndView.addObject("mensagem", "Bem-vindo à minha página!");
        return modelAndView;
    }

}
