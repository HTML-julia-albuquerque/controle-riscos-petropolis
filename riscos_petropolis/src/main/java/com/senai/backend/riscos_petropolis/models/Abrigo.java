package com.senai.backend.riscos_petropolis.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="abrigo")
public class Abrigo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="endereco")
    private String endereco;

    @Column(name="capacidade_total")
    private double capacidade_total;

    @Column(name="capacidade_disponivel")
    private double capacidade_disponivel;

    @Column(name="latitude")
    private double latitude;

    @Column(name="longitude")
    private double longitude;

    public Abrigo() {
    }

    public Abrigo(Integer id, String nome, String endereco, double capacidade_total, double capacidade_disponivel,
            double latitude, double longitude) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.capacidade_total = capacidade_total;
        this.capacidade_disponivel = capacidade_disponivel;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getCapacidade_total() {
        return capacidade_total;
    }

    public void setCapacidade_total(double capacidade_total) {
        this.capacidade_total = capacidade_total;
    }

    public double getCapacidade_disponivel() {
        return capacidade_disponivel;
    }

    public void setCapacidade_disponivel(double capacidade_disponivel) {
        this.capacidade_disponivel = capacidade_disponivel;
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
