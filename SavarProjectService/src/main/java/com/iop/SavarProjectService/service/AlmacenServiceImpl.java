package com.iop.SavarProjectService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.iop.SavarProjectService.dao.AlmacenDAO;
import com.iop.SavarProjectService.dto.Almacen;

@Service
public class AlmacenServiceImpl implements AlmacenService{
	
	private AlmacenDAO almacenDAO;
	

	public void setAlmacenDAO(AlmacenDAO almacenDAO) {
		this.almacenDAO = almacenDAO;
	}

	@Override
	@Transactional
	public void addAlmacen(Almacen a) {
		// TODO Auto-generated method stub
		this.almacenDAO.addAlmacen(a);
		
	}

	@Override
	@Transactional
	public void updateAlmacen(Almacen a) {
		// TODO Auto-generated method stub
		this.almacenDAO.updateAlmacen(a);
	}

	@Override
	@Transactional
	public List<Almacen> listAlmacens() {
		// TODO Auto-generated method stub
		return this.almacenDAO.listAlmacens();
	}

	@Override
	@Transactional
	public Almacen getAlmacenById(String id) {
		// TODO Auto-generated method stub
		return this.almacenDAO.getAlmacenById(id);
	}

	@Override
	@Transactional
	public void removeAlmacen(String id) {
		// TODO Auto-generated method stub
		this.almacenDAO.removeAlmacen(id);
	}
	
	@Override
	@Transactional
	public String getNextId() {
		// TODO Auto-generated method stub
		return this.almacenDAO.getNextId();
	}	
}
