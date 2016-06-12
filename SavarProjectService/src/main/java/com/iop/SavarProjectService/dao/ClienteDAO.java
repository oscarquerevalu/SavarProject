package com.iop.SavarProjectService.dao;

import java.util.List;

import com.iop.SavarProjectService.dto.Cliente;

public interface ClienteDAO {
	
	public void addCliente(Cliente a);
	public void updateCliente(Cliente a);
	public List<Cliente> listClientes();
	public Cliente getClienteById(String id);
	public void removeCliente(String id);
	public String getNextId();
	
}
