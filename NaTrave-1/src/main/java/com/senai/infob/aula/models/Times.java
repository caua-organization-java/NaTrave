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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="times")
public class Times {

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToMany
    @JoinTable(
        name = "times_jogos",
        joinColumns = @JoinColumn(name = "times_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "jogos_id", referencedColumnName = "id")
    )
      private List<Jogos> jogos;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="noticias_time")
    private String noticiasTime;

    @Column(name="resultados")
    private String resultados;

    @Column(name="elenco")
    private String elenco;

    @Column(name="cidade")
    private String cidade;

    @Column(name="uf")
    private String uf;

    public Times() {
    }

    public Times(Integer id, String nome, String noticiasTime, String resultados, String elenco, String cidade,
            String uf) {
        this.id = id;
        this.nome = nome;
        this.noticiasTime = noticiasTime;
        this.resultados = resultados;
        this.elenco = elenco;
        this.cidade = cidade;
        this.uf = uf;
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

    public String getNoticiasTime() {
        return noticiasTime;
    }

    public void setNoticiasTime(String noticiasTime) {
        this.noticiasTime = noticiasTime;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

}
