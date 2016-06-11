package com.iop.SavarProjectService.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Almacen {
	
	@Column
	@Id
	private String idAlmacen;
	
	@OneToMany(mappedBy="almacen",cascade=CascadeType.PERSIST)
	@ElementCollection(targetClass=Costo_envio.class)
	private List<Costo_envio> costo_envios = new ArrayList<Costo_envio>();
	@Column
	private Integer cap_total;
	@Column
	private Double alquiler_x_m3;
	@Column
	private Double volumen_alquiler;
	@Column
	private Integer flg_estado;
	
	public String getIdAlmacen() {
		return idAlmacen;
	}
	public void setIdAlmacen(String idAlmacen) {
		this.idAlmacen = idAlmacen;
	}
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
	public List<Costo_envio> getCosto_envios() {
		return costo_envios;
	}
	public void setCosto_envios(List<Costo_envio> costo_envios) {
		this.costo_envios = costo_envios;
	}
	
	
	
}
