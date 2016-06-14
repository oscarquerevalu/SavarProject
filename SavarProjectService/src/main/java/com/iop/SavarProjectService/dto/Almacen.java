package com.iop.SavarProjectService.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Almacen {
	
	@Column
	@Id
	private String almacen;
	@Column
	private Integer cap_total;
	@Column
	private Double alquiler_x_m3;
	@Column
	private Double costo_total;
	@Column
	private Double volumen_alquiler;
	@Column
	private Integer flg_estado;
	
	public Integer getCap_total() {
		return cap_total;
	}
	public void setCap_total(Integer cap_total) {
		this.cap_total = cap_total;
	}
	public Double getAlquiler_x_m3() {
		return alquiler_x_m3;
	}
	public void setAlquiler_x_m3(Double alquiler_x_m3) {
		this.alquiler_x_m3 = alquiler_x_m3;
	}
	public Double getVolumen_alquiler() {
		return volumen_alquiler;
	}
	public void setVolumen_alquiler(Double volumen_alquiler) {
		this.volumen_alquiler = volumen_alquiler;
	}
	public Integer getFlg_estado() {
		return flg_estado;
	}
	public void setFlg_estado(Integer flg_estado) {
		this.flg_estado = flg_estado;
	}
	public String getAlmacen() {
		return almacen;
	}
	public void setAlmacen(String almacen) {
		this.almacen = almacen;
	}
	public Double getCosto_total() {
		return costo_total;
	}
	public void setCosto_total(Double costo_total) {
		this.costo_total = costo_total;
	}
	
	
	
}
