package com.iop.SavarProjectService.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Cliente_sucursal {
	
	
	@Column
	private String cliente;
	
	@Column
	private String sucursal;
	
	@Id
	@Column
	private Double demanda;

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

	public Double getDemanda() {
		return demanda;
	}

	public void setDemanda(Double demanda) {
		this.demanda = demanda;
	}
}
