package com.springApp.dto;

import com.springApp.interfaces.CRUD;

import javax.persistence.*;


@Entity
@Table(name = "personas")
public class Persona implements CRUD {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idPersona", nullable = false, unique = true)
	private Long id;
	@Column(name = "nombre", length = 50)
	private String nombre;
	@Column(name = "apellido", length = 50)
	private String apellido;
	@Column(name = "edad")
	private int edad;
	@Column(name = "mail")
	private String mail;
	//@Column(name = "documento")
	//private String documento;
	@Column(name = "activo")
	private boolean activo;
	@OneToOne(fetch = FetchType.EAGER)
	private Documento documento;
	@OneToOne(fetch = FetchType.EAGER)
	private Domicilio domicilio;
	
	public Persona() {
		this.activo = true;
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
		this.activo = true;
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
	public boolean getActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	@Override
	public String toString() {
		return String.format("Person{id=%d, nombre='%s', apellido='%s', documento='%s', edad=%d}", id, nombre, apellido, documento, edad);
	}
	
}
