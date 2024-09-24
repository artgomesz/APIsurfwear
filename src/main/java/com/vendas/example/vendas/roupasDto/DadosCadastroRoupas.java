package com.vendas.example.vendas.roupasDto;

public record DadosCadastroRoupas(
    String nome_camiseta,
    Tecido tecido,
    Marca marca,
    Tamanho tamanho,
    String quantidade) {
   //record class não tem a necessidade de construtores etc...classe imutavel 
}
