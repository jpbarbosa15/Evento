package com.devsuperior.evento.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_bloco")
public class Bloco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Instant inicio;
    private Instant fim;

    @ManyToOne
    @JoinColumn(name="atividade_id")
    private Atividade atividade;

    public Bloco(){

    }

    public Bloco(Integer id, Instant inicio, Instant fim) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Integer getId() {
        return id;
    }

    public Instant getInicio() {
        return inicio;
    }

    public Instant getFim() {
        return fim;
    }

    public Atividade getAtividade() {
        return atividade;
    }
}
