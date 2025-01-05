package com.desafio_adx.backend_jaxrs.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String genero;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String dataDeLancamento;

    @Column(nullable = false)
    private String duracao;

    public User() {}

    public User(String titulo, String genero, String descricao, String dataDeLancamento,String duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.descricao = descricao;
        this.dataDeLancamento = dataDeLancamento;
        this.duracao = duracao;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public  String getDuracao(){return duracao;}
    public void setDuracao(String duracao) {this.duracao = duracao;}


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(String dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }
}
