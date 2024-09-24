package com.vendas.example.vendas.controllers;

import com.vendas.example.vendas.roupasDto.Roupas;
import com.vendas.example.vendas.roupasDto.RoupasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendas.example.vendas.roupasDto.DadosCadastroRoupas;

//essa classe será um controler
@RestController

//irá informar qual será o nosso endpoint para realizar requisições
@RequestMapping("/vendas")
public class Vendas {

    @Autowired
    private RoupasRepository repository;

    // é uma anotação usada em aplicações Spring para mapear requisições HTTP do tipo POST a um método controlador.
    @PostMapping
    //não é a melhor forma de fazer requisições pela falta de segurança,por isso a utilização de um DTO
    public void cadastrar(@RequestBody DadosCadastroRoupas dados){
        repository.save(new Roupas(dados));
    }
}
