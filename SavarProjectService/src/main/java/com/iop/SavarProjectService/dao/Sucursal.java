package com.iop.SavarProjectService.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Sucursal {
	
	@Column
	@Id
	private String idSucursal;
	
	@OneToMany(mappedBy="sucursal",cascade=CascadeType.PERSIST)
	@ElementCollection(targetClass=Cliente_sucursal.class)
	private List<Cliente_sucursal> cliente_sucursals = new ArrayList<Cliente_sucursal>();
	
	@Column
	private String nombre_sucursal;
	@Column
	private String direccion_sucursal;
	public String getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(String idSucursal) {
		this.idSucursal = idSucursal;
	}
	public List<Cliente_sucursal> getCliente_sucursals() {
		return cliente_sucursals;
	}
	public void setCliente_sucursals(List<Cliente_sucursal> cliente_sucursals) {
		this.cliente_sucursals = cliente_sucursals;
	}
	public String getNombre_sucursal() {
		return nombre_sucursal;
	}
	public void setNombre_sucursal(String nombre_sucursal) {
		this.nombre_sucursal = nombre_sucursal;
	}
	public String getDireccion_sucursal() {
		return direccion_sucursal;
	}
	public void setDireccion_sucursal(String direccion_sucursal) {
		this.direccion_sucursal = direccion_sucursal;
	}
}
