package com.devsuperior.evento.entities;

import jakarta.persistence.*;

import java.util.ArrayList;

import java.util.List;


@Entity
@Table(name = "tb_atividade")
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private double preco;

    @ManyToOne
    @JoinColumn(name="categoria_id")
    private Categoria categoria;

    @OneToMany(mappedBy = "atividade")
    private List<Bloco> blocos = new ArrayList<>();


    public Atividade(){

    }

    public Atividade(Integer id, String nome, String descricao, double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}
