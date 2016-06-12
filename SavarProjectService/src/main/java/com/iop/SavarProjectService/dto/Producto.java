package com.iop.SavarProjectService.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Producto {
	
	@Column
	@Id
	private String idProducto;
	
	@Column
	private String nombre_producto;
	
	@Column
	private Integer cantidad_producto;
	
	@Column
	private Double volumen_m3;

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public Integer getCantidad_producto() {
		return cantidad_producto;
	}

	public void setCantidad_producto(Integer cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}

	public Double getVolumen_m3() {
		return volumen_m3;
	}

	public void setVolumen_m3(Double volumen_m3) {
		this.volumen_m3 = volumen_m3;
	}
	
}
