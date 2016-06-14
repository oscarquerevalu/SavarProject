package com.iop.SavarProjectService.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Cliente {
	
	@Id
	@Column
	private String cliente;
	
	@Column
	private Double cli_estado;

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Double getCli_estado() {
		return cli_estado;
	}

	public void setCli_estado(Double cli_estado) {
		this.cli_estado = cli_estado;
	}
	
}
