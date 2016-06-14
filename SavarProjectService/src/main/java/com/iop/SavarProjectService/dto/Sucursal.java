package com.iop.SavarProjectService.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Sucursal {
	
	@Id
	@Column
	private String sucursal;
	
	@Column
	private String suc_estado;

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public String getSuc_estado() {
		return suc_estado;
	}

	public void setSuc_estado(String suc_estado) {
		this.suc_estado = suc_estado;
	}
	
}
