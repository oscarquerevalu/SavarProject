package com.iop.SavarProjectService.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Resultado {
	
	@Column
	@Id
	private String idResultado;
	
	@ManyToOne
	private Almacen almacen;
	
	@ManyToOne
	private Cliente_sucursal cliente_sucursal;
	
	@Column
	private Integer cantidad;

	public String getIdResultado() {
		return idResultado;
	}

	public void setIdResultado(String idResultado) {
		this.idResultado = idResultado;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	public Cliente_sucursal getCliente_sucursal() {
		return cliente_sucursal;
	}

	public void setCliente_sucursal(Cliente_sucursal cliente_sucursal) {
		this.cliente_sucursal = cliente_sucursal;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
}
