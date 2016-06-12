package com.iop.SavarProjectService.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Costo_envio {
	
	@Id
	@Column
	private String idAlmacen;
	
	@ManyToOne
	private Almacen almacen;
	
	@Column
	private Double costo;
	@Column
	private Double costo_envio;
	public String getIdAlmacen() {
		return idAlmacen;
	}
	public void setIdAlmacen(String idAlmacen) {
		this.idAlmacen = idAlmacen;
	}
	public Almacen getAlmacen() {
		return almacen;
	}
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	public Double getCosto_envio() {
		return costo_envio;
	}
	public void setCosto_envio(Double costo_envio) {
		this.costo_envio = costo_envio;
	}
	
}
