package com.iop.SavarProjectService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.iop.SavarProjectService.dao.Costo_envioDAO;
import com.iop.SavarProjectService.dto.Cliente_costo;
import com.iop.SavarProjectService.dto.Cliente_costo;

@Service
public class Costo_envioServiceImpl implements Costo_envioService{

	private Costo_envioDAO Costo_envioDAO;
	

	public void setCosto_envioDAO(Costo_envioDAO Costo_envioDAO) {
		this.Costo_envioDAO = Costo_envioDAO;
	}

	@Override
	@Transactional
	public void addCosto_envio(Cliente_costo a) {
		// TODO Auto-generated method stub
		this.Costo_envioDAO.addCosto_envio(a);
		
	}

	@Override
	@Transactional
	public void updateCosto_envio(Cliente_costo a) {
		// TODO Auto-generated method stub
		this.Costo_envioDAO.updateCosto_envio(a);
	}

	@Override
	@Transactional
	public List<Cliente_costo> listCosto_envios() {
		// TODO Auto-generated method stub
		return this.Costo_envioDAO.listCosto_envios();
	}

	@Override
	@Transactional
	public Cliente_costo getCosto_envioById(String id) {
		// TODO Auto-generated method stub
		return this.Costo_envioDAO.getCosto_envioById(id);
	}

	@Override
	@Transactional
	public void removeCosto_envio(String id) {
		// TODO Auto-generated method stub
		this.Costo_envioDAO.removeCosto_envio(id);
	}	
	
	@Override
	@Transactional
	public String getNextId() {
		// TODO Auto-generated method stub
		return this.Costo_envioDAO.getNextId();
	}	

}
