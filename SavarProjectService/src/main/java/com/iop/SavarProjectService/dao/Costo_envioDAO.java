package com.iop.SavarProjectService.dao;

import java.util.List;

import com.iop.SavarProjectService.dto.Cliente_costo;

public interface Costo_envioDAO {
	
	public void addCosto_envio(Cliente_costo ce);
	public void updateCosto_envio(Cliente_costo c);
	public List<Cliente_costo> listCosto_envios();
	public Cliente_costo getCosto_envioById(String id);
	public void removeCosto_envio(String id);	
	public String getNextId();
}
