package com.iop.SavarProjectService.dao;

import java.util.List;

import com.iop.SavarProjectService.dto.Sucursal;

public interface SucursalDAO {
	public void addSucursal(Sucursal s);
	public void updateSucursal(Sucursal s);
	public List<Sucursal> listSucursals();
	public Sucursal getSucursalById(String id);
	public void removeSucursal(String id);	
	public String getNextId();
	
}
