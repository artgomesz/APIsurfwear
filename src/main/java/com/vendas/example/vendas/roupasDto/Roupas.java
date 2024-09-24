package com.vendas.example.vendas.roupasDto;


import jakarta.persistence.*;
import lombok.*;

//Irá criar uma tabela no banco de dados com o nome de Roupa
@Table(name = "Roupa")
//Entidade Banco de dados cujo nome é roupas
@Entity(name = "roupas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Roupas {

    @Id //id da aplicação
    //GeneratedValue irá criar os id's de formna automática no nosso banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //consequentement chave primaria
    private long id;
    private String nome_camiseta;

    //Explica para o Spring que o enum também precisar ser mapeado pelo JPA
    @Enumerated(EnumType.STRING)
    private Tecido tecido;
    private Marca marca;

    @Enumerated(EnumType.STRING)
    private Tamanho tamanho;
    private String quantidade;

    public Roupas(DadosCadastroRoupas dados) {
        this.nome_camiseta = dados.nome_camiseta();
        this.tecido = dados.tecido();
        this.marca = dados.marca();
        this.tamanho = dados.tamanho();
        this.quantidade =dados.quantidade();
    }
}
