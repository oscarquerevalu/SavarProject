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
	private String idCosto_envio;
	
	@ManyToOne
	private Almacen almacen;
	
	@ManyToOne
	private Cliente_sucursal cliente_sucursal;
	
	@Column
	private Double costo;
	@Column
	private Double costo_envio;
	
	
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
	public String getIdCosto_envio() {
		return idCosto_envio;
	}
	public void setIdCosto_envio(String idCosto_envio) {
		this.idCosto_envio = idCosto_envio;
	}
	public Cliente_sucursal getCliente_sucursal() {
		return cliente_sucursal;
	}
	public void setCliente_sucursal(Cliente_sucursal cliente_sucursal) {
		this.cliente_sucursal = cliente_sucursal;
	}
	
}
