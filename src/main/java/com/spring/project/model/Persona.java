package com.spring.project.model;

import javax.persistence.*;

@Entity
@Table(name = "Persona")
public class Persona{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, unique = true)
	private Long id;
	
	@Column(name = "activo")
	private int activo;
	
	@Column(length = 100)
	private String nombre;
	
	@Column(length = 100)
	private String apellido;
	
	@Column
	private int edad;
	
	@Column
	private String mail;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Documento documento;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + activo;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + ((domicilio == null) ? 0 : domicilio.hashCode());
		result = prime * result + edad;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (activo != other.activo)
			return false;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (domicilio == null) {
			if (other.domicilio != null)
				return false;
		} else if (!domicilio.equals(other.domicilio))
			return false;
		if (edad != other.edad)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", activo=" + activo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad="
				+ edad + ", mail=" + mail + ", documento=" + documento + ", domicilio=" + domicilio + "]";
	}
}
