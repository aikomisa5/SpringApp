package com.spring.project.model;

import javax.persistence.*;

@Entity
@Table(name = "Domicilio")
public class Domicilio{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    private Long id;
    
    @Column(name = "nombreCalle")
    private String nombreCalle;
    
    @Column(name = "numeroCalle")
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoPostal == null) ? 0 : codigoPostal.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((localidad == null) ? 0 : localidad.hashCode());
		result = prime * result + ((nombreCalle == null) ? 0 : nombreCalle.hashCode());
		result = prime * result + ((numeroCalle == null) ? 0 : numeroCalle.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + ((partido == null) ? 0 : partido.hashCode());
		result = prime * result + ((piso == null) ? 0 : piso.hashCode());
		result = prime * result + ((provincia == null) ? 0 : provincia.hashCode());
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
		Domicilio other = (Domicilio) obj;
		if (codigoPostal == null) {
			if (other.codigoPostal != null)
				return false;
		} else if (!codigoPostal.equals(other.codigoPostal))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (localidad == null) {
			if (other.localidad != null)
				return false;
		} else if (!localidad.equals(other.localidad))
			return false;
		if (nombreCalle == null) {
			if (other.nombreCalle != null)
				return false;
		} else if (!nombreCalle.equals(other.nombreCalle))
			return false;
		if (numeroCalle == null) {
			if (other.numeroCalle != null)
				return false;
		} else if (!numeroCalle.equals(other.numeroCalle))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (partido == null) {
			if (other.partido != null)
				return false;
		} else if (!partido.equals(other.partido))
			return false;
		if (piso == null) {
			if (other.piso != null)
				return false;
		} else if (!piso.equals(other.piso))
			return false;
		if (provincia == null) {
			if (other.provincia != null)
				return false;
		} else if (!provincia.equals(other.provincia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Domicilio [id=" + id + ", nombreCalle=" + nombreCalle + ", numeroCalle=" + numeroCalle + ", piso="
				+ piso + ", pais=" + pais + ", provincia=" + provincia + ", codigoPostal=" + codigoPostal
				+ ", localidad=" + localidad + ", partido=" + partido + "]";
	}
}
