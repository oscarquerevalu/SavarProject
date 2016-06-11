package com.iop.SavarProjectService.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Control {
	
	@Column
	@Id
	private String idControl;
	
	@Column
	private Integer numero_max_almacen;
	
	@Column
	private Integer numero_min_almacen;

	public String getIdControl() {
		return idControl;
	}

	public void setIdControl(String idControl) {
		this.idControl = idControl;
	}

	public Integer getNumero_max_almacen() {
		return numero_max_almacen;
	}

	public void setNumero_max_almacen(Integer numero_max_almacen) {
		this.numero_max_almacen = numero_max_almacen;
	}

	public Integer getNumero_min_almacen() {
		return numero_min_almacen;
	}

	public void setNumero_min_almacen(Integer numero_min_almacen) {
		this.numero_min_almacen = numero_min_almacen;
	}
	
}
