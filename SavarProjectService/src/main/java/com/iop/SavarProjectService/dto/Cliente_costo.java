package com.iop.SavarProjectService.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cliente_costo {
	
	@Id
	@Column
	private String almacen;
	
	@Column
	private String cliente;
	
	@Column
	private String sucursal;
	
	@Column
	private Double costo;
	
	@Column
	private Double costo_envio;

	public String getAlmacen() {
		return almacen;
	}

	public void setAlmacen(String almacen) {
		this.almacen = almacen;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
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
