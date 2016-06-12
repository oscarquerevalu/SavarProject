package com.iop.SavarProjectService.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Vehiculo {
	
	@Column
	@Id
	private String idVehiculo;
	
	@Column
	private String desc_vehiculo;
	
	@Column
	private Integer cantidad;
	
	@Column
	private Double cap_carga;

	public String getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(String idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getDesc_vehiculo() {
		return desc_vehiculo;
	}

	public void setDesc_vehiculo(String desc_vehiculo) {
		this.desc_vehiculo = desc_vehiculo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getCap_carga() {
		return cap_carga;
	}

	public void setCap_carga(Double cap_carga) {
		this.cap_carga = cap_carga;
	}
	
}
