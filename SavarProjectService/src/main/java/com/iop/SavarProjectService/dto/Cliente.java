package com.iop.SavarProjectService.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Cliente {
	
	@Column
	@Id
	private String idCliente;
	
	@OneToMany(mappedBy="cliente",cascade=CascadeType.PERSIST)
	@ElementCollection(targetClass=Cliente_sucursal.class)
	private List<Cliente_sucursal> cliente_sucursals = new ArrayList<Cliente_sucursal>();
	
	@Column
	private String razon_social;
	@Column
	private String ruc;
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public List<Cliente_sucursal> getCliente_sucursals() {
		return cliente_sucursals;
	}
	public void setCliente_sucursals(List<Cliente_sucursal> cliente_sucursals) {
		this.cliente_sucursals = cliente_sucursals;
	}
	public String getRazon_social() {
		return razon_social;
	}
	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	
}
