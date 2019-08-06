package com.britos.spring.model;

import javax.persistence.*;

@Entity
@Table(name = "PERSONA")
public class Persona{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, unique = true)
	private Long id;
	@Column
	private int activo;
	@Column(length = 100)
	private String nombre;
	@Column(length = 100)
	private String apellido;
	@Column
	private int edad;
	@Column
	private String mail;
	@OneToOne(fetch = FetchType.EAGER)
	private Documento documento;
	@OneToOne(fetch = FetchType.EAGER)
	private Domicilio domicilio;
	
	public Persona() {
		this.activo = 1;
		this.domicilio = new Domicilio();
		this.documento = new Documento();
	}
	public Persona(String nombre, String apellido, int edad, String mail, Documento documento, Domicilio domicilio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.mail = mail;
		this.documento = documento;
		this.domicilio = domicilio;
		this.activo = 1;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	public int getActivo() {
		return activo;
	}
	public void setActivo(int activo) {
		this.activo = activo;
	}
	@Override
	public String toString() {
		return String.format("Person{id=%d, nombre='%s', apellido='%s', documento='%s', edad=%d}", id, nombre, apellido, documento, edad);
	}
	
}
