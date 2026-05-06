package com.senai.backend.riscos_petropolis.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="arearisco")
public class AreaRisco {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="descricao")
    private String descricao;

    @Column(name="nivel_risco")
    private String nivel_risco;

    @Column(name="latitude")
    private double latitude;
    
    @Column(name="longitude")
    private double longitude;

    public AreaRisco() {
    }

    public AreaRisco(Integer id, String nome, String descricao, String nivel_risco, double latitude, double longitude) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.nivel_risco = nivel_risco;
        this.latitude = latitude;
        this.longitude = longitude;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNivel_risco() {
        return nivel_risco;
    }

    public void setNivel_risco(String nivel_risco) {
        this.nivel_risco = nivel_risco;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    
    
}
