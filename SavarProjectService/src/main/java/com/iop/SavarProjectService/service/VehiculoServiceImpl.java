package com.iop.SavarProjectService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.iop.SavarProjectService.dao.VehiculoDAO;
import com.iop.SavarProjectService.dto.Vehiculo;
import com.iop.SavarProjectService.dto.Vehiculo;

@Service
public class VehiculoServiceImpl implements VehiculoService{
	
	private VehiculoDAO VehiculoDAO;
	

	public void setVehiculoDAO(VehiculoDAO VehiculoDAO) {
		this.VehiculoDAO = VehiculoDAO;
	}

	@Override
	@Transactional
	public void addVehiculo(Vehiculo a) {
		// TODO Auto-generated method stub
		this.VehiculoDAO.addVehiculo(a);
		
	}

	@Override
	@Transactional
	public void updateVehiculo(Vehiculo a) {
		// TODO Auto-generated method stub
		this.VehiculoDAO.updateVehiculo(a);
	}

	@Override
	@Transactional
	public List<Vehiculo> listVehiculos() {
		// TODO Auto-generated method stub
		return this.VehiculoDAO.listVehiculos();
	}

	@Override
	@Transactional
	public Vehiculo getVehiculoById(String id) {
		// TODO Auto-generated method stub
		return this.VehiculoDAO.getVehiculoById(id);
	}

	@Override
	@Transactional
	public void removeVehiculo(String id) {
		// TODO Auto-generated method stub
		this.VehiculoDAO.removeVehiculo(id);
	}			
	
	@Override
	@Transactional
	public String getNextId() {
		// TODO Auto-generated method stub
		return this.VehiculoDAO.getNextId();
	}			
}
