/*

package com.medeiros.SPRINGProject.anotacoes;

import models.Produto;
import models.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired // quando se coloca essa notação, o spring cria um objeto automaticamente
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto novoProduto(@RequestParam String nome){
        Produto novoProduto = new Produto(nome);
        produtoRepository.save(novoProduto);
        return novoProduto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos(){
        return produtoRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> obterPRODUTOPorID(@PathVariable int id){
        return produtoRepository.findById(id);
    }
    @PutMapping //serve para alterar o produto inteiro, o pathmapping serve para alguns parâmetros só
    public Produto alterarProduto(Produto produto){
        produtoRepository.save(produto);
        return produto;
    }
    @DeleteMapping(path="/{id}")
    public void excluirProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }





}
*/