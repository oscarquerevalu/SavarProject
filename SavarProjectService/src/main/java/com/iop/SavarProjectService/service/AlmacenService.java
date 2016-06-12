package com.iop.SavarProjectService.service;

import java.util.List;

import com.iop.SavarProjectService.dto.Almacen;

public interface AlmacenService {
	
	public void addAlmacen(Almacen a);
	public void updateAlmacen(Almacen a);
	public List<Almacen> listAlmacens();
	public Almacen getAlmacenById(String id);
	public void removeAlmacen(String id);	
	
}
