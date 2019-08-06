package com.britos.spring.model;

import javax.persistence.*;

@Entity
@Table(name = "DOCUMENTO")
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    private Long id;
    @Column
    private String tipo;
    @Column
    private int numero;

    public Documento(){}

    public Documento(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
