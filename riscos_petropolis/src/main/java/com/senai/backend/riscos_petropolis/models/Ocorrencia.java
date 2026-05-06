package com.senai.backend.riscos_petropolis.models;

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
@Table(name="ocorrencia")
public class Ocorrencia {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="descricao")
    private String descricao;

    @Column(name="data_hora")
    private LocalDate data_hora;

    @Column(name="latitude")
    private double latitude;

    @Column(name="longitude")
    private double longitude;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name = "id_area")
    private AreaRisco area;

    public Ocorrencia() {
    }

    public Ocorrencia(Integer id, String descricao, LocalDate data_hora, double latitude, double longitude,
            Usuario usuario, AreaRisco area) {
        this.id = id;
        this.descricao = descricao;
        this.data_hora = data_hora;
        this.latitude = latitude;
        this.longitude = longitude;
        this.usuario = usuario;
        this.area = area;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData_hora() {
        return data_hora;
    }

    public void setData_hora(LocalDate data_hora) {
        this.data_hora = data_hora;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public AreaRisco getArea() {
        return area;
    }

    public void setArea(AreaRisco area) {
        this.area = area;
    }

    
}
