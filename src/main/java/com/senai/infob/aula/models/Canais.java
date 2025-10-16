package com.senai.infob.aula.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="canais")
public class Canais {

    @ManyToMany
    @JoinTable(
        name = "=canais_jogos",
        joinColumns = @JoinColumn(name = "canais_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "jogos_id", referencedColumnName = "id")
    )
      private List<Jogos> jogos;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="numero")
    private Integer numero;

    public Canais() {
    }

    public Canais(Integer id, String nome, Integer numero) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

}
