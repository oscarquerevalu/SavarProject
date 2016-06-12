package com.iop.SavarProjectService.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Cliente_sucursal {
	
	@Id
	@Column
	private String idCliente_sucursal;
	
	@ManyToOne
	private Cliente cliente;
	
	@ManyToOne
	private Sucursal sucursal;
	
	@OneToMany(mappedBy="cliente_sucursal",cascade=CascadeType.PERSIST)
	@ElementCollection(targetClass=Resultado.class)
	private List<Resultado> resultado = new ArrayList<Resultado>();
	
	@OneToMany(mappedBy="cliente_sucursal",cascade=CascadeType.PERSIST)
	@ElementCollection(targetClass=Resultado.class)
	private List<Costo_envio> costo_envio = new ArrayList<Costo_envio>();

	public String getIdCliente_sucursal() {
		return idCliente_sucursal;
	}

	public void setIdCliente_sucursal(String idCliente_sucursal) {
		this.idCliente_sucursal = idCliente_sucursal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
}
