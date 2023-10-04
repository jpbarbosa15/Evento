package com.devsuperior.evento.entities;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_participante")
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @Column(unique = true)
    private String email;

    @ManyToMany(mappedBy = "participantes")
    private List<Atividade> atividades = new ArrayList<>();

    public Participante(){

    }

    public Participante(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }
}
