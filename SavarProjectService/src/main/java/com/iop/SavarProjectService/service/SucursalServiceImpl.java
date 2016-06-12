package com.iop.SavarProjectService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.iop.SavarProjectService.dao.SucursalDAO;
import com.iop.SavarProjectService.dto.Sucursal;

@Service
public class SucursalServiceImpl implements SucursalService{
	
	private SucursalDAO SucursalDAO;
	

	public void setSucursalDAO(SucursalDAO SucursalDAO) {
		this.SucursalDAO = SucursalDAO;
	}

	@Override
	@Transactional
	public void addSucursal(Sucursal a) {
		// TODO Auto-generated method stub
		this.SucursalDAO.addSucursal(a);
		
	}

	@Override
	@Transactional
	public void updateSucursal(Sucursal a) {
		// TODO Auto-generated method stub
		this.SucursalDAO.updateSucursal(a);
	}

	@Override
	@Transactional
	public List<Sucursal> listSucursals() {
		// TODO Auto-generated method stub
		return this.SucursalDAO.listSucursals();
	}

	@Override
	@Transactional
	public Sucursal getSucursalById(String id) {
		// TODO Auto-generated method stub
		return this.SucursalDAO.getSucursalById(id);
	}

	@Override
	@Transactional
	public void removeSucursal(String id) {
		// TODO Auto-generated method stub
		this.SucursalDAO.removeSucursal(id);
	}		
	
}
