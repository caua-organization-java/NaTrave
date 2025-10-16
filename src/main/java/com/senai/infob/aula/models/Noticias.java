package com.senai.infob.aula.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="noticias")
public class Noticias {

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name="titulo")
    private String titulo;

    @Column(name="descricao")
    private String descricao;

    @Column(name="detalhamento")
    private String detalhamento;

    @Column(name="data_noticia")
    private LocalDate dataNoticia;

    public Noticias() {
    }

    public Noticias(Usuario usuario, Integer id, String titulo, String descricao, String detalhamento,
            LocalDate dataNoticia) {
        this.usuario = usuario;
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.detalhamento = detalhamento;
        this.dataNoticia = dataNoticia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDetalhamento() {
        return detalhamento;
    }

    public void setDetalhamento(String detalhamento) {
        this.detalhamento = detalhamento;
    }

    public LocalDate getDataNoticia() {
        return dataNoticia;
    }

    public void setDataNoticia(LocalDate dataNoticia) {
        this.dataNoticia = dataNoticia;
    }

    




    
    
}
