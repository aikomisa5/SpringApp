package com.springApp.dto;

import javax.persistence.*;

/**
 * Created by mbritos on 26/03/2019.
 */

@Entity
public class Domicilio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idDomicilio", nullable = false, unique = true)
    private Long id;
    @Column
    String nombreCalle;
    @Column
    int numeroCalle;
    @Column
    String piso;
    @Column
    String pais;
    @Column
    String provincia;
    @Column
    String codigoPostal;
    @Column
    String localidad;
    @Column
    String partido;

    public Domicilio(){

    }

    public Domicilio(String nombreCalle, int numeroCalle, String piso, String pais, String provincia, String codigoPostal, String localidad, String partido) {
        this.nombreCalle = nombreCalle;
        this.numeroCalle = numeroCalle;
        this.piso = piso;
        this.pais = pais;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
        this.partido = partido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
}
