package com.senai.infob.aula.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="jogos")
public class Jogos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="data_jogo")
    private LocalDate dataJogo;
    
    @Column(name="fase")
    private String fase;

    @Column(name="confronto")
    private String confronto;

    public Jogos() {
    }

    public Jogos(Integer id, LocalDate dataJogo, String fase, String confronto) {
        this.id = id;
        this.dataJogo = dataJogo;
        this.fase = fase;
        this.confronto = confronto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataJogo() {
        return dataJogo;
    }

    public void setDataJogo(LocalDate dataJogo) {
        this.dataJogo = dataJogo;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getConfronto() {
        return confronto;
    }

    public void setConfronto(String confronto) {
        this.confronto = confronto;
    }





    

    
    
}
