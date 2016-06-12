package com.iop.SavarProjectService.dao;

import java.util.List;

import com.iop.SavarProjectService.dto.Cliente_sucursal;

public interface Cliente_sucursalDAO {
	
	public void addCliente_sucursal(Cliente_sucursal cs);
	public void updateCliente_sucursal(Cliente_sucursal cs);
	public List<Cliente_sucursal> listCliente_sucursals();
	public Cliente_sucursal getCliente_sucursalById(String id);
	public void removeCliente_sucursal(String id);	
	public String getNextId();
	
}
