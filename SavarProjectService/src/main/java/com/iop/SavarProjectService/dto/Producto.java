package com.iop.SavarProjectService.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Producto {
	
	@Id
	@Column
	private String producto;
	
	@Column
	private Integer cantidad_producto;
	
	@Column
	private Double volumen_m3;
	
	@Column
	private Double envio_minimo;
	
	@Column
	private Double alm_minimo;
	
	@Column
	private Double alm_maximo;

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

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public Double getEnvio_minimo() {
		return envio_minimo;
	}

	public void setEnvio_minimo(Double envio_minimo) {
		this.envio_minimo = envio_minimo;
	}

	public Double getAlm_minimo() {
		return alm_minimo;
	}

	public void setAlm_minimo(Double alm_minimo) {
		this.alm_minimo = alm_minimo;
	}

	public Double getAlm_maximo() {
		return alm_maximo;
	}

	public void setAlm_maximo(Double alm_maximo) {
		this.alm_maximo = alm_maximo;
	}
	
	
	
}
