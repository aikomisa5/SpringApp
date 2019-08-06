package com.britos.spring.model;

import javax.persistence.*;

@Entity
@Table(name = "DOMICILIO")
public class Domicilio{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    private Long id;
    @Column
    private String nombreCalle;
    @Column
    private String numeroCalle;
    @Column
    private String piso;
    @Column
    private String pais;
    @Column
    private String provincia;
    @Column
    private String codigoPostal;
    @Column
    private String localidad;
    @Column
    private String partido;

    public Domicilio(){}

    public Domicilio(String nombreCalle, String numeroCalle, String piso, String pais, String provincia, String codigoPostal, String localidad, String partido) {
        this.nombreCalle = nombreCalle;
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

    public String getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(String numeroCalle) {
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
