package com.iop.SavarProjectService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.iop.SavarProjectService.dao.Cliente_sucursalDAO;
import com.iop.SavarProjectService.dto.Cliente_sucursal;

@Service
public class Cliente_sucursalServiceImpl implements Cliente_sucursalService{
	
	private Cliente_sucursalDAO Cliente_sucursalDAO;
	

	public void setCliente_sucursalDAO(Cliente_sucursalDAO Cliente_sucursalDAO) {
		this.Cliente_sucursalDAO = Cliente_sucursalDAO;
	}

	@Override
	@Transactional
	public void addCliente_sucursal(Cliente_sucursal a) {
		// TODO Auto-generated method stub
		this.Cliente_sucursalDAO.addCliente_sucursal(a);
		
	}

	@Override
	@Transactional
	public void updateCliente_sucursal(Cliente_sucursal a) {
		// TODO Auto-generated method stub
		this.Cliente_sucursalDAO.updateCliente_sucursal(a);
	}

	@Override
	@Transactional
	public List<Cliente_sucursal> listCliente_sucursals() {
		// TODO Auto-generated method stub
		return this.Cliente_sucursalDAO.listCliente_sucursals();
	}

	@Override
	@Transactional
	public Cliente_sucursal getCliente_sucursalById(String id) {
		// TODO Auto-generated method stub
		return this.Cliente_sucursalDAO.getCliente_sucursalById(id);
	}

	@Override
	@Transactional
	public void removeCliente_sucursal(String id) {
		// TODO Auto-generated method stub
		this.Cliente_sucursalDAO.removeCliente_sucursal(id);
	}	
}
