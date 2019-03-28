package com.springApp.dto;

import javax.persistence.*;

/**
 * Created by mbritos on 26/03/2019.
 */

@Entity
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idDocumento", nullable = false, unique = true)
    private Long id;
    @Column
    String tipoDocumento;
    @Column
    int numero;

    public Documento(){

    }

    public Documento(String tipoDocumento, int numero){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
