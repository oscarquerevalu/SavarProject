package com.iop.SavarProjectService.service;

import java.util.List;

import com.iop.SavarProjectService.dto.Costo_envio;

public interface Costo_envioService {
	
	public void addCosto_envio(Costo_envio ce);
	public void updateCosto_envio(Costo_envio c);
	public List<Costo_envio> listCosto_envios();
	public Costo_envio getCosto_envioById(String id);
	public void removeCosto_envio(String id);	
	public String getNextId();
}
